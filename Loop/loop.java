import java.util.*;
public class loop{
    public static void main( String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /*
        Syntax for:
         for(intialize;condition;incrementation){
           Body
         }
        Syntax for While:
        while(condition){
          Body
        }
        Syntax for do while:
        do{
        body
        }while(condition);

        for(int i=0;i<=n;i++){
            System.out.println("Hello world");
        }
         */
        int c=0;
        while(c<=n){
            System.out.println("hello world");
            c++;
        }

    }
}