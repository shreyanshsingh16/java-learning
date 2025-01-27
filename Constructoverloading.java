class Circle {
    double x,y;
    double r;

    Circle(double x,double y,double r){
            this.x=x;
            this.y=y;
            this.r=r;
    }

    Circle(double r){
        x=0;
        y=0;
        this.r=r;
    //this(0.0,0.0,0.r);
    }
    Circle(Circle c){
        x=c.x;
        y=c.y;
        r=c.r;
        //this (c.x,c.y,c.r);
    }
    Circle( ){
        x=0.0;
        y=0.0;
        r=7.0;
    //this(0.0,0.0,7.0);
        }
        double circumference(){
            return 2*3.14*r;

        }
        double area(){
            return 3.14*r*r;
        }
}

public class Constructoverloading {
        public static void main(sstring[] args) {
            Circle c1=new Circle(3.0,4.0,3.0);
            Circle c2=new Circle(5);
            Circle c3=new Circle(c1);
            Circle c4=new Circle();
    
            System.out.println("Circumference="+ c1.circumference());
            System.out.println("Area="+ c1.area());
            System.out.println("Circumference="+ c2.circumference());
            System.out.println("Area="+ c2.area());
            System.out.println("Circumference="+ c3.circumference());
            System.out.println("Area="+ c3.area());
            System.out.println("Circumference="+ c4.circumference());
            System.out.println("Area="+ c4.area());
        }
    }

