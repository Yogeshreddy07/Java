package Learn.Loops;

import java.util.Scanner;

public class Loop_2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
            /*
            while(Condition){
            //body
            }
             */
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }
}
