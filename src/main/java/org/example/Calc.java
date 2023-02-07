package org.example;
import java.util.Scanner;
import java.util.logging.*;

public class Calc {
    public static void main(String[] args) {
        int a;
        int b;
        int res;
        int ch;
        Scanner mysc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the 2 numbers:\n");
            a=mysc.nextInt();
            b=mysc.nextInt();
            System.out.println("1.Addition\n");
            System.out.println("2.Subraction\n");
            System.out.println("3.Multiplication\n");
            System.out.println("4.Division\n");
            System.out.println("5.Exit\n");
            System.out.println("Enter the choice:\n");
            ch=mysc.nextInt();
            if(ch==1)
            {
                Add obj=new Add();
                obj.setA(a);
                obj.setB(b);
                System.out.println(obj.operation(a,b));
            }
            else if(ch==2)
            {
                Diff obj=new Diff();
                obj.setA(a);
                obj.setB(b);
                System.out.println(obj.operation(a,b));

            }
            else if(ch==3)
            {
                Mul obj=new Mul();
                obj.setA(a);
                obj.setB(b);
                System.out.println(obj.operation(a,b));

            }
            else if(ch==4)
            {
                Div obj=new Div();
                obj.setA(a);
                obj.setB(b);
                System.out.println(obj.operation(a,b));
            }
            else
            {
                break;
            }
        }

    }
}
class Calculator{
    int a;
    int b;
    Calculator()
    {
        this.a=0;
        this.b=0;
    }

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    //    Calculator(int a,int b)
//    {
//        this.a=a;
//        this.b=b;
//    }
}
class Add extends Calculator
{
    public int operation(int a, int b)
    {
        return a+b;
    }
}
class Diff extends Calculator
{
    public int operation(int a, int b)
    {
        return a-b;
    }
}class Mul extends Calculator
{


    public int operation(int a, int b)
    {
        return a*b;
    }
}class Div extends Calculator
{
       public int operation(int a, int b)
    {
        return a/b;
    }
}