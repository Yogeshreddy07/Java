package DSA.LinkedList;
import java.util.*;
public class l1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        LinkedHashSet<Integer>l=new LinkedHashSet<>();
        LinkedHashSet<Integer>l1=new LinkedHashSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        l.addAll(l1);
        for(int j:l){
            System.out.print(j+" ");
        }
    }
}
