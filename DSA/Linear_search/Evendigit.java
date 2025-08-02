package DSA.Linear_search;
import java.util.*;
public class Evendigit {
    static void even(int arr[],int n){
        int num=0;
        int count =0;
        for(int i=0;i<n;i++){ 
            int c=0;            
            num=arr[i];
            while(num!=0){
                num/=10;
                c++;
            }        
            if(c%2==0){
                count++;
            }
        }System.out.println(count);
    }
    static void usingDigits(int arr[],int n){
        int num=0;
        int count =0;
        for(int i=0;i<n;i++){
            int c=0;
            num=arr[i];
            c= (int)(Math.log10(num))+1;
            if(c%2==0){
                count++;
            }
        }System.out.println(count);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        even(arr,n);
        usingDigits(arr,n);
    }
}
