package DSA.Array;
import java.util.*;
public class Linearsearch {
    public int lsearch(int arr[],int n,int k){

        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Linearsearch l=new Linearsearch();
        int r=l.lsearch(arr,n,k);
        System.out.print("result is at index: "+r);
    }
}
