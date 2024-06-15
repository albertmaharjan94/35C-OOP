public class OperatorClass {
    public static void main(String[] args) {
        /* Arithmetic Operator */
        int a = 10, b = 20;
        int sum = a + b; // here + is an arithmetic Operation
        System.out.println("The sum is " + sum);

        System.out.println("The difference is " + (a -b));
        System.out.println("The multiplication is " + (a * b));
        System.out.println("The division is " + (a/b));
        System.out.println("The modulo is " + (a%b));

        /* Assignment Operator */
        /* Declaration and assignment */
        int number1 = 10;
        int number2;
        /* Assignment after declaration */
        number2 = 20;
        /* Assign value using += */
        System.out.println("Number2 after using += is " + (number2 += 10));
        /* Assign using *=  */
        number2 *= 100; // This is same as doing number2 = number2 * 100
        System.out.println("Number2 after using *= is "  + number2);

        /* Relational Operators */
        int rNumber1 = 9, rNumber2 = 20;
        System.out.println("Is rNumber1 equals to rNumber2 ?"  + (rNumber1 == rNumber2));
        System.out.println("Is rNumber1 less than rNumber2 ?" + (rNumber1 < rNumber2));
        System.out.println("Is rNumber1 greater or equals to rNumber2? " + (rNumber1>=rNumber2));
        System.out.println("Is rNumber1 and rNumber2 not equals to rNumber2? " + (rNumber1!=rNumber2));

        /* Logical Operator */
        int lNumber1 = 40, lNumber2 = 22;
        boolean expression1 = lNumber1 == lNumber2;
        boolean expression2 = lNumber1 > lNumber2;
        System.out.println("And expression using &&  " + (expression1 && expression2));
        System.out.println("Or expression using || " + (expression1 || expression2));
        System.out.println("Not expression using !" + (!expression1));

        /* Unary Operator */
        int uNumber1 = 10;
        uNumber1 ++; // same as uNumber1 = uNumber1 + 1;
        System.out.println("Unary Operator usning ++ " + uNumber1); 
        uNumber1 --; // same as uNumber1 = uNumber1 - 1;
        System.out.println("Unary Operator using -- " + uNumber1); 
        
        /* Ternary Operator */
        int tNumber1 = 20, tNUmber2 = 20;
        boolean tExpression1 = tNumber1 == tNUmber2;
        /* For ternary, First you define expression, if expression is true
         * it returns value after "?"
         * if the expression is false
         * it returns the value after ":"
         * Syntax
         * expression ? true statement : false statement
         */
        String output = tExpression1 ? "True Condition" : "False Condition";
        /* Further be seen as
         * String output;
         * if(tExpression1){
         *  output = "True Condition";
         * }else{
         *  output = "False Condition";
         * }
         */
        int numberOutput = tNUmber2 > tNUmber2 ? 10 : 20;
        System.out.println(output);
        System.out.println(numberOutput);

        /* Task1
         * Write a program to print weather a variable is greater or equal to 18 
         */

         /* Task 2
          * Write a program to print simple interest from variables
          * Make 3 variable for amount, time and rate and save the calculation into a varaible
          * Formula:
          * si = amount * time * rate/100;
          */

          /* Task 3
           * Write a program to print the area and perimeter of rectangle
           * a = l * b
           * p = 2 (l + b)
           */
          
           /* Task 4
            * Comlete the task 1 using ternary operators
            */

    }
}
