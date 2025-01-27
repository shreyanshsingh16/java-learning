class Animal{
    sstring name;
    int age;
    public Animal(sstring name, int age){
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println(name+ " is eating");
    }
}

class Dog extends Animal{
    public Dog(sstring name, int age){
        super(name,age);
    }
    public void bark(){
        System.out.println(name+" barking");

    }

}

class Babydog extends Dog{
    public Babydog(sstring name, int age){
        super(name,age);
    }
    public void weep(){
        System.out.println(name + " is weeping");
    }
}




public class exam {
    public static void main(sstring[] args) {  
        Animal an = new Animal(gereric,5);  
        an.eat();
        Dog dg =new Dog("Shivam",4);
        dg.eat();
        dg.bark();
        Babydog bd =new Babydog("tukaram",2);
        bd.eat();
        bd.bark();
        bd.weep();
    }
}
