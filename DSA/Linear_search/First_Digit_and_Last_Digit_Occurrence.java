package DSA.Linear_search;

import java.util.*;

public class First_Digit_and_Last_Digit_Occurrence {
    public static int [] searchRange(int []num,int t){
        int []ans={-1,-1};
        int start=search(num, t, true);
        int end=search(num, t, false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int []arr,int t,boolean findStartIndex){
        int ans=-1;
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
                //potential ans is found
                ans=mid;
                if(findStartIndex==true){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s[]=searchRange(arr, t);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]+" ");
        }
    }
}
