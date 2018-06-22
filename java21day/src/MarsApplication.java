class MarsApplication {
    public static void main(String[] arguments) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;
        
        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "docked";
        opportunity.speed = 0;
        opportunity.temperature = 0;
        
        spirit.showAttributes();
        System.out.println("Increasing speed tp 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperature to -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();
        
        System.out.println("\nOpportunity Stats:");
        opportunity.showAttributes();
    }
}