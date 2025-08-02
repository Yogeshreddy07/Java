package DSA.Linear_search;
import java.util.*;
public class Linear_search {
    static int search(int []arr,int k, int n){
        if(arr.length==0){
            return -1;
        }
        int f=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                f=1;
                break;
            }
        }
        return f;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("The size of arr ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The num that need to be checked: ");
        int k=sc.nextInt();

        int f=search(arr,k,n);
        System.out.println(f);
    }
}
