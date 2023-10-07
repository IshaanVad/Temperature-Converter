package Personal;

import java.util.*;

public class javaTempConvert {
    public static void main(String[] args) {

        Scanner select = new Scanner(System.in);

        System.out.print("Please select your temperature: F = Fahrenheit , C = Celsius: ");
        String a = select.nextLine();

        if(a.equals("F")){
            System.out.print("Input your desired temperature in Fahrenheit: ");
            float b = select.nextFloat();
            float newCel = ((b-32)*(5.f/9.f));
            System.out.println("Your Fahrenheit converted to Celsius is: " + newCel);
        }else{
            System.out.print("Input your desire temperature in Celsius: ");
            float c = select.nextFloat();
            float newFah = ((c)*(9.f/5.f) + 32);
            System.out.println("Your Celsius converted to Fahrenheit is: " + newFah);
        }
    }
}