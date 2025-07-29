package DSA.Array;
import java.util.*;
public class Leftrotatebyd {
    //brute
    public void lrotaebyd(int[] arr1, int[] arr2, int d, int n){
        for(int i=0;i<d;i++){
            arr2[i]=arr1[i];
        }
        for(int i=d;i<n;i++){
            arr1[i-d]=arr1[i];
        }
        for(int i=n-d;i<n;i++){
            arr1[i]=arr2[i-(n-d)];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int d=sc.nextInt();
        d=d%n;
        for(int i=0;i<n;i++){
            arr1[i]= sc.nextInt();
        }
        Leftrotatebyd l=new Leftrotatebyd();
        l.lrotaebyd(arr1,arr2,d,n);


    }
}
