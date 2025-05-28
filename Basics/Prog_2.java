import java.util.*;
public class Prog_2{
    public static void main(String[] args){
        Scanner sc1= new Scanner(System.in); // Importing the Scanner class for user input
        System.out.println("Enter your name:"); 
        String name= sc1.next();   // Taking input from the user
        System.out.println("Welcome "+name+" to the Java programming world!");
        System.out.println("This is a simple Java program that takes your name as input and greets you.");
    }
}

/*
Sample Output:

Enter your name:
Yogesh
Welcome Yogesh to the Java programming world!
This is a simple Java program that takes your name as input and greets you.
*/