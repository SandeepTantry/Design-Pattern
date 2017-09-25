package org.test.dp.behavioral.interpreter.model;

/**
 * Interpreter pattern is used to defines a grammatical representation for a language
 * and provides an interpreter to deal with this grammar.
 * Interpreter pattern provides a way to evaluate language grammar or expression
 * This pattern can applied for parsing the expressions defined in simple grammars and sometimes in simple rule engines.
 * 
 * . Interpreter pattern can be used when we can create a syntax tree for the grammar we have.
 * . Interpreter design pattern requires a lot of error checking and a lot of expressions and code to evaluate them.
 *   It gets complicated when the grammar becomes more complicated and hence hard to maintain and provide efficiency.
 * eg. java.util.Pattern, java.txt.Format, SQL parsing, symbol processing engine etc.
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostfix implements Pattern
{
    @Override
    public String convert(final String exp)
    {
        int priority = 0;// for the priority of operators.
        String postfix = "";

        final Deque<Character> s1 = new ArrayDeque<>();

        for (int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if (OPERATORS.contains(ch))
            {
                // check the precedence
                if (s1.size() <= 0)
                {
                    s1.push(ch);
                }
                else
                {
                    Character chTop = (Character) s1.peek();
                    if (chTop == '*' || chTop == '/')
                    {
                        priority = 1;
                    }
                    else
                    {
                        priority = 0;
                    }

                    if (priority == 1)
                    {
                        if (ch == '*' || ch == '/'||ch=='%')
                        {
                            postfix += s1.pop();
                            i--;
                        }
                        else
                        { // Same
                            postfix += s1.pop();
                            i--;
                        }
                     }
                     else
                     {
                         if (ch == '+' || ch == '-')
                         {
                             postfix += s1.pop();
                             s1.push(ch);
                         }
                         else
                         {
                             s1.push(ch);
                         }
                     }
                }
            }
            else
            {
                postfix += ch;
            }
        }

        int len = s1.size();
        for (int j = 0; j < len; j++)
           postfix += s1.pop();
        
        return postfix;
    }
}
