package DSA.Cycle_Sort;
import java.util.*;
public class Cycle_Sort {
    static void  sort(int []arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

    }
    static void swap(int arr[],int i,int c){
        int temp=arr[i];
        arr[i]=arr[c];
        arr[c]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
