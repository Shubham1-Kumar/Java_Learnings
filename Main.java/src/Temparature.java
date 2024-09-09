import java.util.Scanner;

public class Temparature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temp in C: ");
        float tempC = input.nextFloat();
        double tempF = (tempC*(1.8)) + 32;
        System.out.println(tempF);
    }

}
