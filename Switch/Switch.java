package Learn.Switch;
import java.util.*;
public class Switch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String f=sc.next();
        switch(f){
            case "apple":
                System.out.print("King of fruits");
                break;
            case "mango":
            System.out.print("King in summer");
                break;
            default:
            System.out.print("Invalid output.");
        }
        //or enhansed switch
        int d=sc.nextInt();
        switch(d){
            case 1->System.out.print("Monday");
            case 2->System.out.print("Tuesday");
            case 3->System.out.print("Wednesday");
            case 4->System.out.print("Thersday");
            case 5->System.out.print("Friday");
            case 6->System.out.print("Sunday");

        }
        System.out.println("");
        //or
        switch(d){
            case 1,2,3,4,5->System.out.print("Weekday");
            case 6,7->System.out.print("weekend");
        }
        //there is also the nested switch case ->swith case inde a switch case.
    }
}
