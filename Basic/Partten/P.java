package Basic.Partten;
import java.util.*;
public class P {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        p5(n);
    }
    static void p2(int n){
/*
n=4

* 
* *
* * *
* * * *
 */
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
    static void p1(int n){
/*
n= 4 

* * * * 
* * * *
* * * *
* * * *
*/
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }System.out.println();
        } 
    }
    static void p3(int n){
/*
n= 4

* * * * 
* * *
* *
*
 */
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
static void p4(int n){
/*
n= 4

1 
1 2
1 2 3
1 2 3 4
 */
        for(int i=0;i<n;i++){
            int k=1;
            for(int j=0;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }System.out.println();
        }
    }
    static void p5(int n){
/*
n= 4

* 
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
 */
        for(int i=0;i<n+1;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");

            }System.out.println();
        }
        for(int i=0;i<n;i++){
   
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }

}
