// public class methodoverloading {
//      public static void main(String [] args){
//         methodoverloading mo = new methodoverloading();
//         mo.add(5,10);
//         mo.add(10,20,30);

//      }
//      void add(int n1, int n2){
//         int res = n1 + n2 ;
//         System.out.println(res);
//      }
//     void add(int n1 , int n2 , int n3){
//         int res = n1 + n2 + n3;
//         System.out.println(res);
//     }
    
// }

public class methodoverloading {
   
    void add(int n1, int n2){
       int res = n1 + n2 ;
       System.out.println(res);
    }
   void add(float n3 , float n4 , float n5){
       float res1 = n3 + n4 + n5;
       System.out.println(res1);
   }
   public static void main(sstring [] args){
      methodoverloading mo = new methodoverloading();
      mo.add(5,10);
      mo.add(2.5f,3.5f,4.5f);
   }
   
}

