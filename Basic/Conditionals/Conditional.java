//conditions if-else
package Basic.Conditionals;
import java.util.*;
public class Conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        /*
if(Condition){
 Condition=true(Execute)
}
else if(Condition){
 Condition=true(Execute)
}
else{
    all condition are false then this will execute
}

*/
        int a=sc.nextInt(); //a=age
        if(a>18){
            System.out.print("Adult");
        }else{
            System.out.print("Not a adult");
        }
    }
}
