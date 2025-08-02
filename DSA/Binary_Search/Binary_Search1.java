package DSA.Binary_Search;
import java.util.*;

public class Binary_Search1 {

    //Code for binary search
    static int bSearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //finding the middle element
            //int mid =(start+end)/2; for larger number the sum might exceed so for that we use
            int mid =start+ (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }



    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        int t=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i = bSearch(arr, t);
        System.out.println(i);
    }

}
