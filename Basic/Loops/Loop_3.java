//Fibo -> 0,1,1,2,3,5,8,13,21'''
package Basic.Loops;
import java.util.*;
public class Loop_3 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<=n;i++){
            int temp=b;
            b=a+b;
            a=temp;
            System.out.print(b+" ");
        }
        System.out.println("\n"+b);
    }
}
