// public class CourseName {
//     //no argument const.
//     CourseName() {
//         System.out.println(" Course Name constructor.");
//     }
// }
// Second: Parameterized constructor
    class Rectangle {
        //  int length;
        //  int width;
    
        Rectangle(int length, int width) {
           System.out.println("Area of the rectangle: "+ length * width );
        }

        // public int cal(){
        //     return length * width;
        // }
    }

 // Third: Default constructor
    class Square {
        // Field
        // int side;
    
        // Default constructor
        Square() {
            int side = 5;
            System.out.println("Side length of the square: " + side);
        }
    }

 public class CourseName{
    public static void main(sstring[] args) {
        // // no-argument conts.
        // CourseName course = new CourseName();

         // Demonstrating parameterized constructor
         Rectangle rectangle = new Rectangle(10, 20);
        //  int area = rectangle.length * rectangle.width;
        //  int area = rectangle.cal();
        //  System.out.println("Area of the rectangle: " + area);

        // Demonstrating default constructor
        Square square = new Square();
       
    }
}