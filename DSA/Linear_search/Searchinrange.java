package DSA.Linear_search;
import java.util.*;
public class Searchinrange {
    static void search(int[] arr, int index1, int index2, int f ){
        for(int i=index1;i<=index2;i++){
            if(arr[i]==f){
                System.out.print("the element found at "+i);
                return;
            }
        }System.out.print("Not Found");
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n Number: ");
        int n=sc.nextInt();
        System.out.print("Enter the array: ");
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the  start index 1 : ");
        int in1 =sc.nextInt();
        System.out.print("Enter the  end index 2 : ");
        int in2 =sc.nextInt();
        System.out.print("Enter the number to find in rage: ");
        int f=sc.nextInt();
        search(arr,in1,in2,f); 
    }
}
