package DSA.Array;

import java.util.*;

public class Sortedarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Sortedarray s=new Sortedarray();

        boolean result=s.sort1(arr,n);
        System.out.print(result);

    }
    public boolean sort1(int arr[],int n){
        for(int i=1;i<n;i++){
            if(arr[i]<=arr[i-1]){
                return false;
            }
        }return true;
    }
}
