import java.util.Scanner;
public class DoWhile{
    public static void main(String[] args){
        int num1 = 0;
        /* while checks the condition first */
        while(num1 < 0){
            System.out.println("This will not print since condition is false");
        }

        /* Do while checks the condition after the loop
        * meaning, do while loop runs at least once even if the condition is false
        */
        do {
            System.out.println("Do while will check condition after the statement");
        }while(num1 < 0);

        /* Use while loop to ask a user for a integer
        * keep asking user for number unless the integer is negative
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scan.nextInt();
        while(input >= 0) {
            System.out.println("Enter negative number");
            input = scan.nextInt();
        }
        scan.close();

    }
}