//https://leetcode.com/problems/sqrtx/description/
package DSA.Binary_Search;
import java.util.*;
public class sqrt {
    static int sqrt_sol(int x){
        if(x==0||x==1){
            return x;
        }
        int l=1;
        int r=x;
        int ans=0;
        while (l<=r){
            int mid= l+ (r-l)/2;
            if((long)mid*mid==x){
                return mid;
            } else if ((long)mid*mid<x) {
                ans =mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sqrt_sol(n);
        System.out.print(s);
    }
}
