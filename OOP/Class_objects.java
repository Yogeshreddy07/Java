package OOP;
import java.util.Scanner;
//-->Class and objects

//crete a class
class Student{
    int rollno;
    String name;
    float marks;
}
public class Class_objects {

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        //Object
        Student yogesh_obj1; // declaration
        yogesh_obj1=new Student(); //initialization
        //initializing the values
        yogesh_obj1.rollno=1;
        yogesh_obj1.name="Yogesh Reddy";
        yogesh_obj1.marks=84;
        //accessing from the obj from class
        int rnum= yogesh_obj1.rollno;
        float marks = yogesh_obj1.marks;
        String name= yogesh_obj1.name;

        System.out.println(rnum +" "+marks+" "+name);
    }
}


