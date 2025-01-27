public class findoutputhomework {

    public static void main(sstring[] args) {
         /* ****************** practice 1 *************************** */

            // int Len = 0;
            // int A = 100;
        
            // Len = sizeof(int);
            // System.out.println("Len : " + Len);
        
            // Len = sizeof(A);
            // System.out.println("Len : " + Len);
        
            // this method is doesn't exsist "sizeof"

            //  ********************practice 2******************************

            // System.out.println(Long.SIZE);
            // System.out.println(Double.SIZE);
            // System.out.println(Integer.SIZE);
        
            // Long.SIZE is a constant in Java that represents the number of bits used to store a long value.
            // A long in Java is a 64-bit signed integer.
            // System.out.println(Long.SIZE); will print 64.
            // and so on 

            // ******************** practice 3 ****************************

            // Long A = 234;
            // Double PI = 3.14;
        
            // System.out.println(A.SIZE);
            // System.out.println(PI.SIZE);
        
            // Java will not automatically convert an int to a Long object. It expects either a long literal or a Long object.
            // You can explicitly specify that the number is a long by appending an L (or l) to the number: Long A = 234L;


                        // ******************** practice 4 ****************************

            // unsigned short A = 234;
            //  int B = 254;
            //  int C = 0;
                   
            //  C = A * 10 + B - A;
                    
            //  System.out.println(C);
                                
            //  unsigned short type. All primitive numeric types in Java are signed, meaning they can represent both positive and nega
 
            // ******************** practice 5 ****************************

            // short A = 234;
            // int B = 254;
            // int C = 0;
        
            // C = A * 10 + B - A;
        
            // System.out.printf("C : %d", C);
        
            // %f: Formats a floating-point number.
            // The format specifier %d is used to print an integer value in decimal format.

            // ******************** practice 6 ****************************

            // float A = 2.3;
            // int B = 3;
            // float C = 0.0;
        
            // C = A * B - 4;
        
            // System.out.printf("C : %f", C);
        
            /* The f suffix is necessary to indicate that 2.3 is a float literal. Without the f, 2.3 would be
              treated as a double, and you'd get a compilation 
             error because of a possible loss of precision when assigning a double to a float. :- float A = 2.3f;  */

             /* printf allows you to control the layout and appearance of output using format specifiers.
             Common Format Specifiers:
           1) Integer Types:

            %d: Formats an integer in decimal
            %o: Formats an integer in octal
            %x: Formats an integer in hexadecimal eg:-      System.out.printf("Hexadecimal: %x%n", 123);
                                                                     Output: Hexadecimal: 7b
            
            %X: Formats an integer in hexadecimal with uppercase letters. eg:-   System.out.printf("Hexadecimal (uppercase): %X%n", 123);
                                                                                        Output: Hexadecimal (uppercase): 7B

           2) Floating-Point Types:

            %f: Formats a floating-point number in decimal notation.
            %.2f: Formats a floating-point number with 2 decimal places. eg:- System.out.printf("Floating-point (2 decimal places): %.2f%n", 12.345);
                                                                                    Output: Floating-point (2 decimal places): 12.35

            %e: Formats a floating-point number in scientific notation
            %g: Formats a floating-point number using the shorter of %f or %e.

            3) String Types:

            %s: Formats a string. eg:- System.out.printf("String: %s%n", "Hello");
                                            Output: String: Hello

            4) Character Types:

            %c: Formats a single character. eg:-System.out.printf("Character: %c%n", 'A');
                                                    Output: Character: A

            5) Miscellaneous:
            %n: Inserts a newline character (platform-independent, replaces \n).
            %%: Prints a literal % character.






 */

        
         // ******************** practice 7 ****************************

        //  float A = 2.3F;
        //  int B = 3;
        //  int C = 0;
     
        //  C = A * B - 4;
     
        //  System.out.println(C);


     /*To fix this error, you need to explicitly cast the float result to an int before assigning it to C.
      This cast will truncate the decimal part and convert the float to an int. :- C = (int) (A * B - 4); */

         // ******************** practice 8 ****************************


    //   byte A = 10;
    //   byte B = 30;
    //   byte C = 0;
  
    //   C = A * B;
  
    //   System.out.println(C);

      /*Java automatically promotes byte values to int during arithmetic operations. 
      This means that A * B results in an int value, not a byte.
      The byte type in Java has a range from -128 to 127.

 */


      
      // ******************** practice 9 ****************************

          // int num = 0;

          // num = System.out.printf("Hello World");

          // System.out.println(num);

 //you can not define 2 values in 1 variable yes you can convert a value of int to string like :- String str = Integer.toString(num);



        // ******************** practice 10 ****************************

    //     long int num1 = 10;
    // short int num2 = 20;

    // long num3 = 0;

    // num3 = num1 + num2 * 10 + 20;

    // System.out.println(num3);


    /*In Java, the types long int and short int are not valid data types. However, Java has similar data types for representing integers with different ranges and storage sizes:

    long: This is used for larger integer values.
    short: This is used for smaller integer values. */      
  
  
    // ******************** practice 11 ****************************
  
  }
    }
    

