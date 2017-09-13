package org.test.dp.behavioral.chainofresp.test;

import java.io.InputStreamReader;
import java.util.Scanner;

import org.test.dp.behavioral.chainofresp.model.CurrencyDispenser;

public class CurrenyDispenserTester
{
    public static void main(String[] args)
    {
        final CurrencyDispenser dispenser = new CurrencyDispenser();
        
        try(final Scanner scanner = new Scanner(new InputStreamReader(System.in)))
        {
            String flag = "Y";
            start : while("Y".equalsIgnoreCase(flag))
            {
                System.out.println("Enter the amount in multiples of 10");
                final int amt = scanner.nextInt();
                if (amt % 10 != 0)
                {
                    break start;
                }
                else
                {
                    dispenser.dispenseAmount(amt);
                    System.out.println("Do you wish to continue?(Y|N)");
                    flag = scanner.next();
                }
            }
        }
        finally
        {
            System.out.println("\nProgram ending...");
        }
    }
}
