package org.test.dp.creational.abstractfactory.test;

import org.test.dp.creational.abstractfactory.model.AbstractFactory;
import org.test.dp.creational.abstractfactory.model.Bank;
import org.test.dp.creational.abstractfactory.model.Loan;

import static org.test.dp.creational.abstractfactory.model.FactoryCreator.getFactory;

import java.io.InputStreamReader;
import java.util.Scanner;

public class FactoryCreatorTester
{
    public static void main(String[] args)
    {
        try (final Scanner scanner = new Scanner(new InputStreamReader(System.in)))
        {
            System.out.println("Enter preferred bank name\n[HDFC/SBI/Syndicate]");
            final String bankName = scanner.nextLine();
            final AbstractFactory bankFactory = getFactory("bank");
            final Bank bank = bankFactory.getBank(bankName.trim().toLowerCase());
            
            System.out.println("You have chosen Bank -- " + bank.getBankName() + "\n");
            
            System.out.println("Enter preferred loan name\n[Personal/Educational/Home]");
            final String loanName = scanner.nextLine();
            final AbstractFactory loanFactory = getFactory("loan");
            final Loan loan = loanFactory.getLoan(loanName.trim().toLowerCase());
            
            System.out.println("Enter the loan amount");
            final Double loanAmount = Double.parseDouble(scanner.nextLine().trim());
            System.out.println("Enter the number of years to pay the loan");
            final Integer years = Integer.parseInt(scanner.nextLine().trim());
            
            loan.calculateLoanPayment(loanAmount, years);
        }
        /*catch (Exception e)
        {
            e.printStackTrace();
        }*/
        finally
        {
            System.out.println("\nProgram ended...");
        }
    }
}
