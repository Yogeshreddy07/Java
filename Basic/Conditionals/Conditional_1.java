//for finding max values
package Basic.Conditionals;
import java.util.*;
public class Conditional_1 {
    public static void maxi(int a,int b,int c){
        int max=Math.max(c,Math.max(a,b));
        System.out.print(max);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a;
        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }
        System.out.println(max);
        maxi(a,b,c);

    }
}
