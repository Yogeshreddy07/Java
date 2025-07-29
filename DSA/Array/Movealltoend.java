package DSA.Array;
import java.util.*;
public class Movealltoend {
    public void movealltoend(int []arr, int n, ArrayList<Integer> l){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                l.add(arr[i]);
            }else{
                count++;
            }
        }
        for(int i=0;i<count;i++){
            l.add(0);
        }
        for(int i:l){
            System.out.print(i+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Movealltoend m=new Movealltoend();
        m.movealltoend(arr,n,l);

    }
}
