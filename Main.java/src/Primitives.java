import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        int roll_no = 64;
//        String is not primitive( Data type which we can not break even further)
        String name = "Shubham1-Kumar";
        char letter = 'r';
        float marks = 98.67f;
        double largeDecimalNumbers = 45445453453.44542355244;
        long largeIntegerValue = 30495830458085050L;
        boolean check = false;
        Scanner input = new Scanner(System.in);
        int cLass_Roll_No = input.nextInt();
        String name1 = input.next();
        System.out.println("Your roll number is :" + cLass_Roll_No);
        System.out.println(name1);
        float marks1 = input.nextFloat();
        System.out.println(marks1);
    }
}
