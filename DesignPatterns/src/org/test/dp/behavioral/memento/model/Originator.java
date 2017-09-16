package org.test.dp.behavioral.memento.model;

/**
 * Memento pattern is used to restore state of an object to a previous state.
 * Memento pattern is used to implement this in such a way that the saved state data of the object is not accessible
 * outside of the object, thus protecting the integrity of saved state data.
 * 
 * Memento is often used in conjunction with Iterator. An Iterator can use a Memento to capture the state of an iteration.
 * The Iterator stores the Memento internally.
 * 
 * Command can use Memento to maintain the state required for an undo operation.
 * 
 * 1. Caretaker 2. Originator 3. Memento
 * 
 *  eg. Car parts assembling/disassembling, text editors
 */

public class Originator
{
    private String state;
    
    public void setState(final String state)
    {
        this.state = state;
    }
    
    public String getState()
    {
        return state;
    }

    // operational methods
    public Memento saveState()
    {
        return new Memento(state);
    }
    
    public void restoreState(final Object obj)
    {
        final Memento memento = (Memento) obj;
        state = memento.getState();
    }
    
    // -- memento class
    private class Memento
    {
        private String state;
        
        private Memento(final String state)
        {
            this.state = new String(state);
        }
        
        public String getState()
        {
            return state;
        }
    }
}
