import java.util.Scanner;

public class vowelsto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";

        for(int i =0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                str += '*';
            }
            else{
                str += ch;
            }
            
        }
        System.out.println(str);
        sc.close();
    }
}










    
