package java21days;

// Create an object that assigns values to the variables from the
// other class.

class Exercise32App {
    
    public static void main(String[] arguments) {
        
        Exercise32 box = new Exercise32();
        
        box.height = 32;
        box.weight = 64;
        box.depth = 128;
        
// Then display them        
        
        System.out.println("Box height: " + box.height);
        System.out.println("Box weight: " + box.weight);
        System.out.println("Box depth: " + box.depth);
    }
}