package DSA.Binary_Search;
import java.util.*;
public class Binary_Search_2D_Array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int arr1[]=search(arr,target);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    static int [] search(int[][]arr,int target){
        int r=0;
        int c=arr.length-1;
        while(r< arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }return new int[]{-1,-1};
    }
}
