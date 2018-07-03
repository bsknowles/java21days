package game;

public class PlayerApp {

// Create a main method

    public static void main(String[] arguments){
        
// Create a new object from the Player class called One
// Assign attrbiutes to the three varibales
        
        Player One = new Player();
        One.name = "Player One";
        One.HP = 10;
        One.MP = 50;
        
// Call the method from Player class to display the stats        

        One.showAttributes();
        
        
    }

}

