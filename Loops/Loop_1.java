//Simple for Loop prog to execute loop form 1 ->n number.
package Learn.Loops;
import java.util.*;
public class Loop_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*
        for(initialization ; condition ; increment){
            //body
        }
         */
        // print number from 1 to n
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}
