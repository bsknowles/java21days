package java21days;

class EqualsTester {
    public static void main(String[] arguments) {
        String str1, str2;
        str1 = "Boy, that escalated quickly";
        str2 = str1;
// add the strings, point str2 to the str1 object

        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2));

// shows the same value and the object is the same 
        
        str2 = new String(str1);
        
// create new object for str2 with the value of str1        
        
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2));
        System.out.println("Same value? " + str1.equals(str2));
        
// shows the objects are now different but the values are the same

       
        
    }
}