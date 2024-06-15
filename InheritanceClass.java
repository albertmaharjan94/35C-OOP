public class InheritanceClass{
    public static void main(String[] args){
        ChildClass cc = new ChildClass();
        cc.lastname = "XYZ";
        cc.expenses = 1000.1;
        cc.firstname = "ABC";
        cc.info();
        cc.detail();
        // cc.salary = 10000; //
    }
}
class ParentClass{
    public String lastname;
    private int salary;
    protected double expenses;
    void info(){
        System.out.println("Parent function " + lastname);
    }
}
// single level inheritance - One parent and One child
// use "extends" to inherit a class
class ChildClass extends ParentClass{
    String firstname;
    void detail(){
        System.out.println("Child function " + firstname + " " + lastname);
    }
}
// multi level inheritance - Nested class
class GrandChildClass extends ChildClass{
    String middlename;
    void description(){
        System.out.println(firstname + " " + middlename + " " + lastname);
    }
}
// tree/ hierarical  inhertiance
class BrotherClass extends ParentClass{
    String address;
    void living(){
        System.out.println("Address " + address);
    }
}


class Animal{

}
class Mammal extends Animal{

}
class Reptile extends Animal{

}
class Amphibian extends Reptile{

}
class Dog extends Mammal{

}
class Cat extends Mammal{

}
class Labrador extends Dog{

}
class GermanShepard extends Dog{

}