import java.util.ArrayList;
public class ArrayListLoop{
    public static void main(String[] args){
        /* Import arraylist in the top */
        ArrayList<String> names = new ArrayList<>();

        names.add("Ankit");
        names.add("Parvesh");
        names.add("Puja");
        names.add("Yubraj");
        names.add("Manisha");
        names.add("Dawa Dai");
        names.add("Shreeya");
        /* To get the lenght of arraylist we use .size() function */
        int namesLength = names.size();
        /* It will return how many element is in the arraylist */
        // Use for loop 
        for(int index = 0 ; index < namesLength; index ++){
            System.out.println("Names in index " + index + " " + names.get(index));
        }
        System.out.println("Using For Each Loop in Java");
        /* Use Collection for each */
        for(String element: names){
            System.out.println(element);
        }

        /* Task 
        * Make an ArrayList called animals
        * ["Dog", "Cat", "Tiger", "Elephant"]
        * Make two additional ArrayList wild and domestic
        * Loop the animals 
        * if the element is "Dog", "Cat" add in domestic ArrayList
        * if the element is "Tiger", "Elephant" add in wild
        * Print domestic and wild ArrayList
        */
        ArrayList<String> animals = new ArrayList<>();
        ArrayList<String> wild = new ArrayList<>();
        ArrayList<String> domestic = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Tiger");
        animals.add("Elephant");
        int animalLenght = animals.size();
        for(int index = 0 ; index < animalLenght; index ++ ){
            String singleAnimal = animals.get(index);
            if(singleAnimal == "Cat" || singleAnimal == "Dog"){
                domestic.add(singleAnimal);
            }
            if(singleAnimal == "Elephant" || singleAnimal == "Tiger"){
                wild.add(singleAnimal);
            }
        }
        // Other way/ for each
        for(String element: animals){
            if(element == "Cat" || element == "Dog"){
                domestic.add(element);
            }
            if(element == "Tiger" || element == "Elephant"){
                wild.add(element);
            }
        }


    }
}