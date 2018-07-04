package java21days;

class ArrayCopier {
    public static void main(String[] arguments) {
// Create an int array called array1 and fill will variables

        int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };

// Create a float array called array2 and make it the size of the array1's length
// not sure what array2 has to be created as an object rather than a normal float
// variable

        float[] array2 = new float[array1.length];
        
// Open the output before the for loop        
        
        System.out.print("array1: [ ");
        
// Create a for loop, use the int varibale i to be used as a counter to
// increase for every loop
        
        for (int i = 0; i <array1.length; i++) {
            
// Then print out the result followed by a space            
            
            System.out.print(array1[i] + " ");
        }
        
// Close the printed line        
        
        System.out.println("]");
        
// Open the output before the while loop        
            
        System.out.print("array2: [ ");
        
// Create an int called count to be used as a counter        
        
        int count = 0;
        
// Create a while loop to produce the         
        
        while (count < array1.length && array1[count] != 1) {
            array2[count] = (float) array1[count];
            System.out.print(array2[count++] + " ");
        }
        
        System.out.println("]");
        
        
    }
    
    
}