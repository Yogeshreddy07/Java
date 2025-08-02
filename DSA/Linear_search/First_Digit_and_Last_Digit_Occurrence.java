package DSA.Linear_search;

import java.util.*;

public class First_Digit_and_Last_Digit_Occurrence {
    static int search(int []arr,int t){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(t>arr[mid]){
                start=mid+1;
            }
            else if(t < arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s=search(arr,t);
        System.out.println(s);
    }
}
