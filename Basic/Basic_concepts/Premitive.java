package Basic_concepts;
import java.util.*;
public class Premitive {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //Integer
        //__ (underscore are used to saparate in the 10,000-->>10_000 )
        byte b=sc.nextByte();//Small integers (-128 to 127)
        short s=sc.nextShort();//Larger than byte (-32,768 to 32,767)
        int integer=sc.nextInt();//Most common for integers
        long l=sc.nextLong();//	Larger integers

        //Decimal
        float f=sc.nextFloat();//Decimal with 7 digits precision
        double d=sc.nextDouble();//Decimal with 15 digits precision

        //Char
        char c=sc.next().charAt(0);//Single character (Unicode)

        //String
        String s1=sc.next();
        String s2=sc.nextLine();

        //boolean
        boolean t=sc.nextBoolean();

        //Outputs
        System.out.println("The Byte Num is:"+b);
        System.out.println("The Short Num is:"+s);
        System.out.println("The Int Num is:"+integer);
        System.out.println("The Long Num is:"+l);
        System.out.printf("The float Num is:%.2f\n",f);
        System.out.println("The Double Num is:"+d);
        System.out.println("The char is"+c);
        System.out.println("The String is"+s1);
        System.out.println("The String is"+s2);
        System.out.println("The Boolean is"+t);


    }
}
