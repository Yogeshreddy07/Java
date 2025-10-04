//Finding the largest in the array
package DSA.Array;
import java.util.*;
public class Max {
    static void brute_max(int arr[]){
        Scanner sc=new Scanner(System.in) ;
        Arrays.sort(arr);
        int n=arr.length;
        System.out.println(arr[n-1]);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        Max obj=new Max();
        //call the brute fource
        obj.brute_max(arr);
    }
}
