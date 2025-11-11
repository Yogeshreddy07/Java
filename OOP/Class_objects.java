package OOP;
import java.util.Scanner;
//-->Class and objects

//create a class
class Student{
    int rollno;
    String name;
    float marks;
}
public class Class_objects { //main class

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        //Object
        Student yogesh_obj1; // declaration
        yogesh_obj1=new Student(); //initialization
        Student Student2=new Student(); // in one line
        //initializing the values
        // object 1
        yogesh_obj1.rollno=1;
        yogesh_obj1.name="Yogesh Reddy";
        yogesh_obj1.marks=84;
        //accessing from the obj from class
        int rnum= yogesh_obj1.rollno;
        float marks = yogesh_obj1.marks;
        String name= yogesh_obj1.name;
        Student2.rollno=2;
        Student2.name="Yogi";
        Student2.marks=90;
        System.out.println(rnum +" "+marks+" "+name);//1 84.0 Yogesh Reddy
        // object 2
        int rnum1= Student2.rollno;
        float marks1 = Student2.marks;
        String name1= Student2.name;
        System.out.println(rnum1 +" "+marks1+" "+name1); //2 90.0 Yogi
    }
}


