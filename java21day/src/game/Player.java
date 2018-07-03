// Ref package name.

package game; 

// Start a new class called Player.

public class Player {

// Add a few baisc variables, and use their correct type.
    
        String name;
        int HP;
        int MP;
        
// Add a Method to display the stats of the Player object
// Using \t to tab the results
                    
        void showAttributes() {
        System.out.println("Character name is: \t" + name);
        System.out.println("Character HP is: \t" + HP);
        System.out.println("Character MP is: \t" + MP);
        
        }
    
}

