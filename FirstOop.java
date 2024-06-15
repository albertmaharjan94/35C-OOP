public class FirstOop{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "Ram";
        p1.age = 10;
        p1.gender = 'M';
        p1.introduction();

        Person p2 = new Person();
        p2.name = "Hary";
        p2.age = 20;
        p2.gender = 'F';
        p2.introduction();

        Square s1 = new Square();
        s1.sides = 10;
        int s1Area =  s1.area();
        System.out.println(s1Area);
        System.out.println(s1.area());
        s1.increaseSidex(2);
        System.out.println(s1.area());

        Rectangle r1 = new Rectangle();
        r1.lenght = 100;
        r1.breadth = 23;
        double areaR1 = r1.area();
        System.out.println("Area is " + areaR1);
        System.out.println("Perimeter is " + r1.perimeter());
        r1.info();
    }
}
// Task create class Car
// create attribute name, brand, year
// create a function expiry that returns year added with 100
// create a function start -> prints(name is starting)
// create a function stop -> prints(name, brand is stoping)
// create a function info -> prints(name, brand and year)
// create 2 objects
// fill attribute of both
// start both object
// stop 1st object
// info of 2nd object
class Car{
    String name, brand;
    int year;
    
    int expiry(){
        return year + 100;
    }
    void start(){
        System.out.println(name + " is starting");
    }
    void stop(){
        System.out.println(name + ", " + brand + " is stopping");
    }
    void info(){
        System.out.println(name + ", " + brand + " and " + year);
    }
}


// Task Create a class Rectangle
// create 2 attribute, length and breadth as double
// make a function that returns area of rectangle
// make a function that returns perimeter of rectangle
// make a function info, that prints the length and breadth of the Rectangle
// make an object of Rectangle
// fill both the attribute/fields
// call the area and perimeter and print them
// call the function info
class Rectangle{
    double lenght;
    double breadth;

    double area(){
        return lenght * breadth;
    }
    double perimeter(){
        return 2 * (lenght + breadth);
    }
    void info(){
        System.out.println("Length "+ lenght + " Breadth " + breadth);
    }
}
class Square{
    int sides;
    int area(){
        return sides * sides;
    }
    void increaseSidex(int val){
        sides = sides + val;
    }
}

class Person{
    String name;
    int age;
    char gender;

    void introduction(){
        System.out.println("My name is " + name);
    }
}