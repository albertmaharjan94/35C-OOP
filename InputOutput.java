import java.util.Scanner;
// or 
// import java.util.*; // import all the utils
public class InputOutput{
    public static void main(String[] args) {
        /* Print/output a line with line break
         * use "sout" shortcut
         */
        System.out.println("This prints and breaks line");
        /* Print the word without line break */
        System.out.print("This will not break line");
        System.out.print(" This line will continue\n");

        /* Output formating
         * System.out.printf();
         * %s String, %d integral, %f floating point, %b boolean
         * This will not break line too
         */
        System.out.printf("The next word is %s", "New word");
        System.out.printf("The next int is %d", 10);
        /* You can use multiple formatter */
        System.out.printf("Multiple %f %b", 10.9f, false);

        /* User Input using Scanner
         * first import the Scanner class
         * import java.util.Scanner; // at the top of the file
         */
        Scanner scan = new Scanner(System.in); // System.in is used as input
        // System.out.println("The following takes one word from sentence");
        // String oneWord = scan.next();
        // System.out.println(oneWord);
        System.out.println("The following takes whole sentence");
        String wholeSentence = scan.nextLine();
        System.out.println(wholeSentence);
        System.out.println("The following takes int");
        int intInput = scan.nextInt();
        System.out.println(intInput);
        System.out.println("The following takes boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println(booleanInput);
        scan.close();

        /* Task
         * Create a new Scanner obj name scan1
         * Prompt user for the following
         * What is your name? -> Save to String name, use nextLine()
         * Are you over 18? -> Save to boolean status, use nextBoolean()
         * How many siblings do you have? -> Save int sibling, use nextInt()
         * Print the output
         * Hello, name
         * Over 18 status, 
         * You have sibling number of siblings
         */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan1.nextLine();
        System.out.println("Are you over 18?");
        boolean status = scan1.nextBoolean();
        System.out.println("How many siblings do you have?");
        int sibling = scan1.nextInt();
        System.out.println("Hello, " + name);
        System.out.println("Over 18? " + status);
        System.out.printf("You have %d number of siblings\n", sibling);
        scan1.close();
    }
}