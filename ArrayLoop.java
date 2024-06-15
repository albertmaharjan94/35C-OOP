public class ArrayLoop{
    public static void main(String[] args){
        int[] data = {10, 20, 30, 40 , 50};
        int arrayLength = data.length;
        /* first approach */
        for(int index = 0; index < arrayLength; index ++){
            System.out.println("Index " + index + " Value" + data[index]);
        }
        System.out.println("Using length - 1");
        /* Second approach */
        for(int index = 0; index <= arrayLength - 1; index ++){
            System.out.println("Index " + index + " Value" + data[index]);   
        }
        // data[100]; this will crash, no index accessible
        /* Task Make an array of length 10
        * Add the value as 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
        * Make another array with the same lenght 10
        * Add the value of first array in negative onto second array
        * Use loop on first array to complete this
        * second array should be -10, -20, -30, -40, -50, -60, -70, -80, -90, -100
        * Print the second array
        */
        int[] firstArray  = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int firstArrayLength = firstArray.length;
        int[] secondArray = new int[10];
        for(int index = 0; index < firstArrayLength; index ++){
            secondArray[index] = - firstArray[index];
            System.out.println(secondArray[index]);
        }

        /* Task
        * print the second array in descending 
        * should be : -100, -90, -80, -70, ...., -10
        * Note: start loop from (length - 1) to 0
        */
        int secondArrayLength = secondArray.lenght;
        for(int index = secondArrayLength - 1; index >=0 ; index --){
            System.out.println("Desceding  "+ secondArray[index]);
        }


    }
}