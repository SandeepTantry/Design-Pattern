package org.test.dp.behavioral.memento.model;

public class Caretaker
{
    private Object obj;
    
    public void save(final Originator obj)
    {
        this.obj = obj.saveState();
    }
    
    public void undo(final Originator obj)
    {
        obj.restoreState(this.obj);
    }
}
