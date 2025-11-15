package OOP;

import java.util.Scanner;

//All about Constructors + this
public class Constructors {
    int rno;
    String name;
    float marks=90;

    //default constructor
    Constructors(){
        //we need a way to add the values of the above
        //properties object by object

        //we need one word to access every object using ->>> this << (keyword)
        this.rno=13;
        this.name="yogesh";
        this.marks=100;
    }

    //parameterized constructor
    Constructors(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }

    void greeting(){
        System.out.println("Hello! My name is "+ name);
    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        //obj created and called default constructor
        Constructors obj=new Constructors();
        obj.greeting();

        //obj created and called parameterized constructor
        Constructors obj1=new Constructors(1,"S Yogesh Reddy",99);
        obj1.greeting();

    }
}
