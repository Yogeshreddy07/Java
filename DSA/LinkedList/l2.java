package DSA.LinkedList;
import java.util.*;
public class l2 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=arr[i]+arr[j];
                if(t==sum){
                    System.out.print(i+" "+j);
                    break;
                }
            }
        }
    }}