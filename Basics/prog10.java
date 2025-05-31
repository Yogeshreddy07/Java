import java.util.*;
public class prog10 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char i=sc.next().charAt(0);
        System.out.println((int)i);
        int t=(int)i;
        if(t>=65&&t<=90){
            System.out.print("caps");
        }
        else if(t>=97&&t<=121){
            System.out.println("Small");
        }
    }
}
