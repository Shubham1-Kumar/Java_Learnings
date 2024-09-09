import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Automatic implicit conversion
//        float num = input.nextFloat();  If you give an int type value as input it will convert it to float.
//        System.out.println(num);

//         float num = input.nextInt(); // It will convert the int input to the float,
//
//         int num1 = (int)(input.nextFloat());  // Explicit conversion or narrow conversion or Typecasting

////       Automatic type promotion in expressions
//        int a = 258;
//        byte b = (byte)(a);
//        // out put will be 1, because range of byte is 256, if value > 256 then the o/p = value % 256
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b)/c;  // Here we can see 40*50 is exceeding the range of byte. But java automatically promoting it to int while evaluating
////        Here a*b is performed using int even though they are  byte
//        System.out.println(d);

//        byte b = 50;
////        b = b*2; This will give an error

//        int number = 'a';
//        System.out.println(number); //
//        short a = 2;
//        System.out.println(a);
//

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.243f;
        double d = 0.4442342;
        double result = (f*b) + (i/c) - (d - s);

        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        System.out.println(result);

    }
}
