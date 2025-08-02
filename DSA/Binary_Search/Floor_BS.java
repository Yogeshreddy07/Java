package DSA.Binary_Search;

import java.util.Scanner;

public class Floor_BS {
    //Code for binary search to find the targets floor element
    //returns the index of smalled no <=target
    static int floor(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //finding the middle element.
            //int mid =(start+end)/2; for larger number the sum might exceed so for that we use.
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
        return end;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        int t=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i = floor(arr, t);
        System.out.println(i);
    }
}
