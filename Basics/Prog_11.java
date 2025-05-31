import java.util.*;
public class Prog_11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] ar=new int[s];

        for(int i=0;i<s;i++){
             ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
                int l=ar[s-1];
        int sl=0;
         for(int i=s-2;i>=0;i--){
            if(ar[i]!=l){
                 sl=ar[i];
                 break;
            }
        }
        System.out.print(sl);
    }
}
