package Learn.Loops;
import java.util.*;
public class Loop_4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int c=0;
        int t=n;
        while(t>0){
            int d=t%10;
            if(d==s){
                c++;
            }
            t/=10;
        }
        System.out.print(s+"="+c);

    }


}
