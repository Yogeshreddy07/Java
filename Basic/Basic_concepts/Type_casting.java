package Basic_concepts;

public class Type_casting {
    public static void main(String[]args){
    //typecasting ->  conversion of one datatype to another.
        //widening (Implicit)-->small-->Big (Auto)

        int a=1000;
        long b=a;
        float c=b;
        double d=c;
        System.out.print(a+" "+b+" "+c+" "+d);

        //narrowing(Explicit)-->Big-->Small

        int e=(int)d;
        byte f=(byte)e;
        System.out.println(" "+e+" "+f);

        //char and int
        char ch = 'B';
        int code = ch;     // 66
        char ch2 = (char) (code + 1); // 'C'
        System.out.println(ch+" "+code+" "+ch2);
/*

Numeric to Boolean Not Allowed
int a = 1;
boolean b = (boolean) a; //  Compile-time Error

*/
        //Typecasting with Wrapper Classes
        Integer i = Integer.valueOf("123");
        int x = i; // auto-unboxing

        String s = "456";
        int y = Integer.parseInt(s); // String → int
        double d1 = Double.parseDouble("3.14"); // String → double

        System.out.println(i+" "+x+" "+s+" "+y+" "+d1);




    }
}
