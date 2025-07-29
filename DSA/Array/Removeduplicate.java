package DSA.Array;
import java.util.*;
public class Removeduplicate {
    //brute-->NlogN +N
    public int dup1(int arr[],int n) {

        LinkedHashSet <Integer>a1=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            a1.add(arr[i]);
        }
        int c=0;
        for(int j = 0; j<a1.toArray().length; j++){
            c++;
        }
        return c;
    }
    //optimal--> TC:N
    public int dup2(int arr[],int n){
        int num=arr[0];
        int c=1;
        for(int i=1;i<n;i++){
            if(num!=arr[i]){
                num=arr[i];
                c++;
            }
        }return c;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Removeduplicate a=new Removeduplicate();
        int r = a.dup1(arr,n);
        int r1= a.dup2(arr,n);
        System.out.println(r);
        System.out.println(r1);
    }
}
