public class StaticFunction{
    /* static function with modifier */
    public static int addNumber(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static String vendingMachine(int menu){
        if(menu == 1){
            return "Coke";
        }
        if(menu == 2){
            return "Water";
        }
        if(menu == 3){
            return "Frooti";
        }
        return "Invalid Menu";
    }

    public static void main(String[] args){
        /* We donot have to create object for static function 
        * If the static function is in same class
        * can just call from function name */
        int returnFromFunction = addNumber(20, 20);
        System.out.println("Returned Value is " + returnFromFunction);

        String returnItem = vendingMachine(1);
        System.out.println("You have chosen " + returnItem);

        
        /* Make a function adoptPet
        * Takes animal type as String
        * if the animal is Dog, Cat, Snake return true
        * else return false
        */

        /* Make a function eligibleTest
        * Takes name as String and age as int
        * if age is less than 0 
        * return "Hello name, your age is invalid"
        * if age is less than 18
        * return "Hello name, you are underage"
        * if age is more than 18
        * return "Congratulation name, you are eligible"
        */
    }
}