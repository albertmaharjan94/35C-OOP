public class AccessModifier{
    public static void main(String[] args){
        AccessExample ae = new AccessExample();
        ae.name = "Ram";
        ae.age = 10;
        // ae.phNo = "980123123"; //
        ae.printThis();
        ae.printName();
        // ae.privateFunction(); //
        ae.accessPrivate();
        ae.setPhNo("9080123");
        ae.accessPrivate();
        System.out.println(ae.getPhNo());

        Dog d1 = new Dog();
        d1.age = 10;
        d1.setBreed("Shepard");
        d1.setName("Tommy");
        System.out.println("Name: " + d1.getName());
        System.out.println("Breed: " + d1.getBreed());
        System.out.println("Age: " + d1.age);
    }
}
// Task 
// Make a class Dog
// make 2 private attribute, name and breed
// make 1 public attribute, age
// make setter for name and breed
// make getter for name and breed
// Make 1 object of Dog
// fill all the attribute
// print the following from object
// Name: xyz
// Breed: abc
// Age: 10
class Dog{
    private String name, breed;
    public int age;
    void setName(String n){
        name = n;
    }
    void setBreed(String b){
        breed = b;
    }
    String getName(){
        return name;
    }
    String getBreed(){
        return breed;
    }
}

class AccessExample{
    String name; // Automatically default, meaning package/folder access
    public int age; // public can be access from anywhere
    private String phNo; // private can be accessed only in class
    void setPhNo(String p){
        phNo = p;
    }
    String getPhNo(){
        return phNo;
    }
    // same goes to function
    void printThis(){
        System.out.println("Printing detail");
    }
    public void printName(){
        System.out.println("Name is " + name);
    }
    private void privateFunction(){
        System.out.println("This can be run only inside this class");
    }
    void accessPrivate(){
        System.out.println(phNo);
        privateFunction();
    }
}