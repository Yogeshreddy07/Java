package Basic_concepts;
import java.util.*;
public class Base {
    //method for string
    static int sum(int a,int b){
        int s=a+b;
        return s;
    }
    public static void main(String[]args){
        System.out.println("Hello World!");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        System.out.print(sum(n,n1));
    }
}
