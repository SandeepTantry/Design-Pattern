package org.test.dp.behavioral.visitor.test;

import java.io.InputStreamReader;
import java.util.Scanner;

import org.test.dp.behavioral.visitor.model.CabBooking;
import org.test.dp.behavioral.visitor.model.CabBooking.TYPE;
import org.test.dp.behavioral.visitor.model.Meru;
import org.test.dp.behavioral.visitor.model.Ola;
import org.test.dp.behavioral.visitor.model.Uber;
import org.test.dp.behavioral.visitor.model.User1;

public class CabBookingTester
{
    public static void main(String[] args)
    {
        User1 user;
        
        try (final Scanner scanner = new Scanner(new InputStreamReader(System.in)))
        {
            //String ch = "N";
            //do
            //{
                System.out.println("Hi User. Enter your name");
                final String name = scanner.nextLine();
                user = new User1(name);
                
                System.out.println("Welcome to cabBooking system.\nPlease select a cab of your choice");
                System.out.println("1.Ola\t2.Uber\t3.Meru");
                final int cab = scanner.nextInt();
                System.out.println("Select type of cab");
                System.out.println("1.Mini\t2.Shared\t3.Sedan\t4.Innova\t5.Rick");
                final int type = scanner.nextInt();

                CabBooking car;
                switch(cab)
                {
                    case 1 : car = new Ola("KA01ET8904", "Sandeep", 12.5f, getType(type)); break;
                    case 2 : car = new Uber("KA01ET8905", "Mandeep", 12.25f, getType(type)); break;
                    case 3 : car = new Meru("KA01ET8906", "Pradeep", 12f, getType(type)); break;
                    default : throw new RuntimeException("Wrong option chosen");
                }
                
                car.accept(user);
                
                //System.out.println("Do you wish to book another cab. Y\\N");
                //ch = scanner.nextLine(); 
            //} while ("Y".equals(ch));
        }
        finally
        {
            System.out.println("\nEnding program...");
        }
    }
    
    public static TYPE getType(int choice)
    {
        switch(choice)
        {
            case 1 : return TYPE.MINI;
            case 2 : return TYPE.SHARE;
            case 3 : return TYPE.SEDAN;
            case 4 : return TYPE.INNOVA;
            case 5 : return TYPE.RICK;
            default : throw new RuntimeException("Wrong choice");
        }
    }
}
