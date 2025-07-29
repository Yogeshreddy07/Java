//Basic Array -> 1D array
package DSA.Array;
import java.util.*;
public class Abasic {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // array declaration:
        //datatype[]variable_name=new datatype[size];
        int[]a1=new int[n];
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        //Simple method
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }
        //or->for each loop
        for(int i :a1){
            System.out.print(i+" ");
        }
        //using String
        System.out.print(Arrays.toString(a1));
        //
        String a2[]=new String[n];
        for(int i=0;i<n;i++){
            a2[i]=sc.next();
        }
        for(String i :a2){
            System.out.print(i+" ");
        }
    }
}
