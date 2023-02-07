package org.example;
import java.util.Scanner;
import java.util.logging.*;

public class Calc {
    public static void main(String[] args) {
        int a;
        int b;
        int ch;
        Scanner mysc=new Scanner(System.in);
        Logger log=Logger.getLogger("com.api.jar");
        while(true)
        {
            System.out.println("Enter the 2 numbers:\n");
            a=mysc.nextInt();
            b=mysc.nextInt();
            log.info("1.Addition");
            log.info("2.Subraction");
            log.info("3.Multiplication");
            log.info("4.Division");
            log.info("5.Exit");
            log.info("Enter the choice:");
            ch=mysc.nextInt();
            if(ch==1)
            {
                Add obj=new Add();
                obj.setA(a);
                obj.setB(b);
                log.info(""+obj.operation(a,b));
            }
            else if(ch==2)
            {
                Diff obj=new Diff();
                obj.setA(a);
                obj.setB(b);
                log.info(""+obj.operation(a,b));

            }
            else if(ch==3)
            {
                Mul obj=new Mul();
                obj.setA(a);
                obj.setB(b);
                log.info(""+obj.operation(a,b));

            }
            else if(ch==4)
            {
                Div obj=new Div();
                obj.setA(a);
                obj.setB(b);
                log.info(""+obj.operation(a,b));
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