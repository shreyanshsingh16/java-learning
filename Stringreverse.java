public class Stringreverse {
    public static void main(String[] args) {
        String s1 = "`sushant, hello";
        String reverse ="";
        for(int i = s1.length() -1 ; i>=0;i--){
            reverse = reverse + s1.charAt(i);
        }
        System.out.println("reverse string is: "+reverse);

        
    }
}
