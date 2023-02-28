package org.example;
import java.util.Scanner;
import java.util.logging.*;

public class Calc {
    public static void main(String[] args) {
        int a;
        int b;
        int ch;
        String res;
        Scanner mysc=new Scanner(System.in);
        Logger log=Logger.getLogger("com.api.jar");
        while(true)
        {
            log.info("Enter the 2 numbers:");

            a=mysc.nextInt();
            b=mysc.nextInt();
            log.info("1.Addition");
            log.info("2.Subtraction");
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
                res=""+obj.operation();
                log.info(res);
            }
            else if(ch==2)
            {
                Diff obj=new Diff();
                obj.setA(a);
                obj.setB(b);
                res=""+obj.operation();
                log.info(res);
            }
            else if(ch==3)
            {
                Mul obj=new Mul();
                obj.setA(a);
                obj.setB(b);
                res=""+obj.operation();
                log.info(res);

            }
            else if(ch==4)
            {
                Div obj=new Div();
                obj.setA(a);
                obj.setB(b);
                res=""+obj.operation();
                log.info(res);
            }
            else
            {
                break;
            }
        }

    }
}


