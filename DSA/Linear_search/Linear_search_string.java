package DSA.Linear_search;
import java.util.*;
public class Linear_search_string {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        char[]a=sc.next().toCharArray(); //by using the char array
        char b=sc.next().charAt(0);
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                System.out.print("Found the char At index "+i);
                return;
            }
        }
        System.out.print("Not Found the char");
    }
}
