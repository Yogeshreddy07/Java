package Basic.Conditionals;
import java.util.*;
public class Conditional_2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char n=sc.next().trim().charAt(0);
        if(n>='a'&&n<='z'){
            System.out.print("Lower case");
        }
        else if(n>='A'&&n<='Z'){
            System.out.print("Upper Case");
        }
        else{
            System.out.print("Invalid Character");
        }
    }

}
