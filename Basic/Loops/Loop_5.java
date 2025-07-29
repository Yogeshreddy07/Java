//reverese the number
package Basic.Loops;
import java.util.*;
public class Loop_5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int sum=0;
        int n=t;
        while(n>0){
            int d=n%10;
            n/=10;
            sum=sum*10+d;
        } System.out.print(sum);

    }
}
