package org.test.dp.creational.abstractfactory.test;

import java.io.InputStreamReader;
import java.util.Scanner;

import org.test.dp.creational.abstractfactory.model.Animal;
import org.test.dp.creational.abstractfactory.model.AnimalFactoryCreator;

public class AnimalFactoryCreatorTest
{
    public static void main(String[] args)
    {
        try (final Scanner scanner = new Scanner(new InputStreamReader(System.in)))
        {
            String flag = "Y";
            do
            {
                System.out.println("Enter type of Animal\n[Herbivores/Omnivores]");
                final String type = scanner.nextLine().trim();
                
                System.out.println("Enter dwelling of Animal\n[City/Village/Forest]");
                final String dwell = scanner.nextLine().trim();
                
                final Animal a = AnimalFactoryCreator.getAnimal(type, dwell);
                a.eat();
                
                System.out.println("Do you want to continue\nPress 'Y' or 'N'");
                flag = scanner.nextLine();
            } while ("Y".equalsIgnoreCase(flag));
                
        }
        catch (RuntimeException e)
        {
            //main(null);
            System.out.println("Unable to create animal");
        }
        finally
        {
            System.out.println("\nProgram ended...");
        }
    }
}
