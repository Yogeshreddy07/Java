/*
Amstronno --> 
  if 153 is the number the 1^3+5^3+3^3 =153 ;
  so , 153==153 then its a Amstron No.
*/
package Basic.Function;
import java.util.*;
public class Amstronno {
    static boolean armstrongno(int num){
        int c=0; // for count
        int o=num;
        int o1=num;
        while (num>0){
            num/=10;
            c++;
        }
        int sum=0;
        while(o>0){
            int d=o%10;
            sum+=Math.pow(d,c);
            o/=10;
        }
        if(sum==o1){
            return true;
        }
        return false;
        

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(armstrongno(n));
    }
}
