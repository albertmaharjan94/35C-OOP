public class ConstructorClass{
    public static void main(String[] args){
        ConstructorExample ce = new ConstructorExample();
        System.out.println("Line after object");
        ConstructorExampleTwo cTwo = new ConstructorExampleTwo("Afon namm", 10, 'M');
        System.out.println(cTwo.gender);

        // Task 2
        Cat c1 = new Cat("XYZ", 10);
        c1.breed = "ABC";
        System.out.println("Name: " + c1.getName());
        System.out.println("Breed: " + c1.breed);
        System.out.println("Age: " + c1.getAge());
    }
}
// Task
// Make a class Cat
// Make private attributes name, age
// Make public attribute breed
// Make a Constructor that sets name and age only
// Make getter for name and age
// Make an object of Cat
// Print the following from object
// Name : XYZ
// Breed: ABC
// age : 10
class Cat{
    private String name;
    private int age;
    public String breed;
    Cat(String n, int a){
        name = n;
        age = a;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}

class ConstructorExampleTwo{
    private String name;
    private int age;
    public char gender;
    ConstructorExampleTwo(String n, int a, char g){
        name = n;
        age = a;
        gender = g;
    }

}
class ConstructorExample{
    ConstructorExample(){
        System.out.println("I run in object creation");
        // Continue logic when creating object
        // In most case we use constructor to set attributes
    }
}