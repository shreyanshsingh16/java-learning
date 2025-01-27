import java.util.Scanner;

class bestworstav {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ");
        int a = sc.nextInt();

        //best case
        // String vote = (a >= 18)? "Eglible":"Noteglible";
        // System.out.println(vote);

        //average case
        /**if(a>=18){
            System.out.println("Eglible");
        }
        else{
            System.out.println("Noteglible");
        }
**/

        //worst case
        switch(a) {
                case 18:
                    System.out.println("Congratulations! You just became eligible to vote.");
                    break;
                default:
                    if (a < 18) {
                        System.out.println("You are not eligible to vote yet. Wait until you are 18.");
                    } else {
                        System.out.println("You are eligible to vote. Exercise your right responsibly.");
                    }
                    break;
            }


        
    }
}