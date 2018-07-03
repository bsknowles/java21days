package java21days;

class Exercise3 {
    
    public static void main(String[] arguments) {
        
        String myBirthday = "01/12/1980";
    
        String month = myBirthday.substring(3, 5);
        String day = myBirthday.substring(0, 2);
        String year = myBirthday.substring(6, 10);
        
        System.out.println("My Birthday is: " + myBirthday);
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        
    }
}