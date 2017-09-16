package org.test.dp.behavioral.memento.test;

import org.test.dp.behavioral.memento.model.Caretaker;
import org.test.dp.behavioral.memento.model.Caretaker2;
import org.test.dp.behavioral.memento.model.Originator;

public class MementoPatterTester
{
    public static void main(String[] args)
    {
        /*final Caretaker caretaker = new Caretaker();
        final Originator originator = new Originator();
        
        originator.setState("state#01");
        caretaker.save(originator);
        System.out.println("Current state of obj --> " + originator.getState());
        caretaker.undo(originator);
        System.out.println("Current state of obj (after undo) --> " + originator.getState());
        
        System.out.println();*/
        
        final Caretaker2 caretaker2 = new Caretaker2();
        final Originator originator2 = new Originator();
        
        // series of saves
        originator2.setState("state#01");
        System.out.println("Current state of obj2 --> " + originator2.getState());
        caretaker2.save(originator2);
        originator2.setState("state#02");
        System.out.println("Current state of obj2 --> " + originator2.getState());
        caretaker2.save(originator2);
        originator2.setState("state#03");
        System.out.println("Current state of obj2 --> " + originator2.getState());
        caretaker2.save(originator2); // do not save this
        
        System.out.println();
        
        // series of undo
        caretaker2.undo(originator2);
        System.out.println("Current state of obj2 (after undo) --> " + originator2.getState());
        caretaker2.undo(originator2);
        System.out.println("Current state of obj2 (after undo) --> " + originator2.getState());
        caretaker2.undo(originator2);
        System.out.println("Current state of obj2 (after undo) --> " + originator2.getState());
        //caretaker2.undo(originator2); // throws exception
        
        System.out.println();
        
        // series of redo
        caretaker2.redo(originator2);
        System.out.println("Current state of obj2 (after redo) --> " + originator2.getState());
        caretaker2.redo(originator2);
        System.out.println("Current state of obj2 (after redo) --> " + originator2.getState());
        //caretaker2.redo(originator2); // throws exception
    }
}
