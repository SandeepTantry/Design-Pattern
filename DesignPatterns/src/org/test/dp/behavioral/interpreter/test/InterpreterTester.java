package org.test.dp.behavioral.interpreter.test;

import org.test.dp.behavioral.interpreter.model.InfixToPrefix;
import org.test.dp.behavioral.interpreter.model.InfixToPostfix;

public class InterpreterTester
{
    public static void main(String[] args)
    {
        // BODMAS rule
        final String exp = "(a+b)-d*c/e";
        //exp = "a+b-d*c/e";

        // TODO
        /*final InfixToPrefix ip = new InfixToPrefix();            
        final String infix = ip.convert(exp);
        System.out.println("Infix:   " + infix);*/

        final InfixToPostfix fp = new InfixToPostfix();
        final String postfix = fp.convert(exp);
        System.out.println("Postfix: " + postfix);
    }
}