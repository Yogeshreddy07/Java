package DSA.Binary_Search;

import java.util.Scanner;

public class Order_Agnostic_BS {
    static int Search(int arr[],int t){
        int start=0;
        int end=arr.length-1;
        //find whether the array is sorted in asending or descending
        boolean isAse= arr[start]<arr[end];

        while(start<=end){
            //finds the middle elsement
            //int mid =(start+end)/2; for larger number the sum might exceed so for that we use
            int mid=start+(end-start)/2;
            
            if(arr[mid]==t){
                return mid;
            }
            if(isAse){
                if(t<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

            else{
                if(t>arr[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        int t=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i = Search(arr, t);
        System.out.println(i);
    }
}
