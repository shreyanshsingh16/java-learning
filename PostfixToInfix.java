import java.util.Stack;

public class PostfixToInfix {
    // Function to convert postfix to infix
    public static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            // If character is an operand, push it as a string
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");  // Convert char to String and push
            }
            // If character is an operator, pop two elements and create an infix expression
            else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String newExpr = "(" + operand1 + ch + operand2 + ")"; // Create infix expression
                stack.push(newExpr);
            }
        }
        // The final expression in the stack is the infix expression
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "AB+C*D-";  // Example postfix expression
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Infix Expression: " + postfixToInfix(postfix));
    }
}
