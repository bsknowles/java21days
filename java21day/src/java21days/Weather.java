package java21days;

public class Weather {
    public static void main(String[] arguments) {
        float fah = 86;
        System.out.println(fah + " degrees Fahrenheit is ...");
        // To convert Fahrenheit to Celsius
        // begin by subtractig 32
        fah = fah - 32;
        // Divide the answer by 9
        fah = fah / 9;
        // Multiply the answer by
        fah = fah * 5;
        System.out.println(fah + " degrees Celsius\n");
        
        float cel = 33;
        System.out.println(cel + " degrees Celsius is ...");
        // To convert Celsius into Fahreheit
        // begin by mutiplying by 9
        cel = cel * 9;
        // Divide the answer by 5
        cel = cel / 5;
        // Add 32 to the answer
        cel = cel + 32;
        System.out.println(cel + " degrees Fahreheit");
    }
}