package DSA.Linear_search;
import java.util.*;
public class Linear_search_min {
    static void mins(int arr[],int n){
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<=min){
              min=arr[i];  
            }
        }
        System.out.println(min);
    }
    static void mins1(int arr[],int n){
        int min=arr[0];
        for(int i=0;i<n;i++){
            min=(int)Math.min(min,arr[i]);
        }
        System.out.println(min);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mins(arr,n);
        mins1(arr,n);
    }
}
