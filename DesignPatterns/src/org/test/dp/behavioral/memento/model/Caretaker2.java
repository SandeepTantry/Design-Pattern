package org.test.dp.behavioral.memento.model;

import java.util.ArrayList;
import java.util.List;

public class Caretaker2
{
    final List<Object> states = new ArrayList<>();
    int pos;
    
    public void save(final Originator obj)
    {
        states.add(obj.saveState());
        ++pos;
    }
    
    public void undo(final Originator obj)
    {
        if (pos > 0)
        {
            obj.restoreState(states.get(--pos));
        }
        else
        {
            throw new RuntimeException("No more undo possible");
        }
    }
    
    public void redo(final Originator obj)
    {
        if (pos < states.size())
        {
            obj.restoreState(states.get(++pos));
        }
        else
        {
            throw new RuntimeException("No more redo possible");
        }
    }
}
