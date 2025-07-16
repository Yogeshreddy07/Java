package Learn.Conditionals;
import java.util.*;
public class Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sal=sc.nextInt();
        if(sal<10000){
            System.out.println(sal+1000);
        }else if(sal<=10000 || sal<=50000){
            System.out.println(sal+2000);
        }else{
            System.out.println(sal+3000);
        }
    }
}
