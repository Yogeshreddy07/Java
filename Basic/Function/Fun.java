package Basic.Function;
import java.util.*;
public class Fun {
    /*
    Functions-->
    access modifier |return_type| name_of_function(){
        //body
        return statement
    }
     */
    static void sum(int a,int b){
        Scanner sc=new Scanner(System.in);
        //a=sc.nextInt();
        //b=sc.nextInt();
        int s=a+b;
        System.out.println(s);
        }
        //also
    static void sum2(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=a+b;
        System.out.print(s);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        /*
        if this have to be done 100time it is inefficient if we copy and paste.->>So Use Functions
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=a+b;
        System.out.print(s);
        */
        sum(10,3);
        sum2();


    }
}
