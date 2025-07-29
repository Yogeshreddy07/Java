package Basic.Conditionals;
import java.util.Scanner;

public class C2fandF2c {
    static void ftoc(float c){
        float f1 = (c - 32) * (5.0f / 9.0f);
        System.out.println(f1);
    }

    static void ctof(float c){
        float f1 = (c * (9.0f / 5.0f)) + 32;
        System.out.println(f1);
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in which you need to covert:(c-->f)-->1 and (f-->c)-->0");
        float n = sc.nextInt();
        if(n==0){
            System.out.println("The conversion is (f-->c)");

            System.out.print("Enter temperature in Fahrenheit: ");
            float f=sc.nextFloat();
            ftoc(f);
        }
        else if(n==1){
            System.out.println("The conversion is (c-->f)");

            System.out.print("Enter temperature in Celsius: ");
            float c=sc.nextFloat();
            ctof(c);
        }
        else {
            System.out.println("Invalid choice.");
        }
    }
}
