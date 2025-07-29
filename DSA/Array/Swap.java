package Array;
import java.util.*;
public class Swap {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int s1=sc.nextInt();
        int s2=sc.nextInt();        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=arr[s1];
        arr[s1]=arr[s2];
        arr[s2]=temp;
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
