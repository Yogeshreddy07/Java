package DSA.Linear_search;
import java.util.*;
public class Searching_in_2d {
    static void searchUsingVoid(int[][] arr, int n, int k, int e){
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                 if(arr[i][j]==e){
                    System.out.print("Element fond at: "+i+","+j);
                    return;
                 }
            }
        }
        System.out.print("Element not found");
    }
    static int[] searchUsingIntArray(int[][] arr, int n, int k, int e){
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                if(arr[i][j]==e){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    // max sum in the 2D array in j
    static int sumMaxIn2D(int[][] arr, int n, int k){
        int max=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<k;j++){
               sum+=arr[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[][] arr =new int[n][k];
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //int e=sc.nextInt();
        //int a[]=searchUsingIntArray(arr,n,k,e);
        //System.out.println(a[0]+" "+a[1]);
        //searchUsingVoid(arr,n,k,e);
        int c=sumMaxIn2D(arr,n,k);
        System.out.println(c);
    }
}
