import java.util.*;
public class Prog_4 {
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.print("Hello Type Num 1");
        int num1=sc1.nextInt(); // Taking integer input for roll number
        System.out.print("Hello Type Num 2");
        int num2=sc1.nextInt();
        int sum=num1+num2;
        System.out.println("Sum:"+sum);
    }
}
