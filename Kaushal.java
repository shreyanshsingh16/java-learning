class demo{
    int x;
    private static int y;
    void fun1(){
        x=45;
    }
    void fun2(){
        y=34;
    }
}
    class Kaushal{
        public static void main(sstring[]args){
            demo d1= new demo();
            d1.fun1();
            d1.fun2();
            System.out.print(" X : " + d1.x);
            System.out.print(" Y : " + d1.y);

        }
    }

