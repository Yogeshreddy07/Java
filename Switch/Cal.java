package Learn.Switch;
//Calculator
import java.util.*;
public class Cal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value A :");
        int a=sc.nextInt();
        System.out.print("Enter the value B :");
        int b=sc.nextInt();
        System.out.print("Enter the No to calculate 1-sum,2-dif,3-mul,4-div,5-mod:");
        int cal=sc.nextInt()
        
        
        ;
        switch(cal){
            case 1:
            System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);break;
            case 3:System.out.println(a*b);  break;
            case 4:System.out.println( (float)a/b);break;
            case 5:System.out.println(a%b);  break;
            default:System.out.println("Enter the valid num for calculation");                    
        }
    }
    
}
