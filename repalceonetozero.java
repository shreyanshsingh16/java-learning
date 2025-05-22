
    import java.util.Scanner;

    public class repalceonetozero {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter an number: ");
            int num = scanner.nextInt();
            int t; char place = '1';
            String result = "";
            
           while(num!=0){
            t=num%10;
            if(t==1){
               result=result+place;

            }
            else
                result=result+t;
                
            num=num/10;
           }
            System.out.println("The number after replacing 1 with 0 is: "+result);
            scanner.close();
        }
    }

