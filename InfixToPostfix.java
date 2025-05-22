import java.util.Stack;

public class InfixToPostfix {

    // Function to determine operator precedence
    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1; // Low precedence
            case '*':
            case '/':
                return 2; // Medium precedence
            case '^':
                return 3; // High precedence (Exponentiation)
            default:
                return -1; // Not an operator
        }
    }

    // Function to convert an infix expression to a postfix expression
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder(); // Stores the postfix expression
        Stack<Character> stack = new Stack<>(); // Stack to store operators

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // If character is an operand (A-Z or 0-9), add it directly to postfix
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }
            // If character is '(', push it onto the stack
            else if (ch == '(') {
                stack.push(ch);
            }
            // If character is ')', pop and append until '(' is found
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove '(' from stack
            }
            // If character is an operator (+, -, *, /, ^)
            else {
                // Pop higher precedence operators from stack and append to postfix
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch); // Push current operator to stack
            }
        }

        // Pop remaining operators from stack and append to postfix
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String infix = "A+B*(C-D)"; // Example infix expression
        System.out.println("Infix Expression: " + infix);
        System.out.println("Postfix Expression: " + infixToPostfix(infix));
    }
}
