package DSA.Insertion_Sort;
import java.util.*;
public class Insertion_Sort {
    static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]) {
                    swap(arr, j, j - 1);
                }else{
                    break;
                }
            }
        }

    }
    static void swap(int []arr,int j,int k){
        int temp=arr[j];
        arr[j]=arr[k];
        arr[k]=temp;
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
