package org.test.dp.behavioral.observer.model;

/**
 * Define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 * 
 * Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change.
 * In observer pattern, the object that watch on the state of another object are called <b>Observer</b> and the object that is being watched is called <b>Subject</b>.
 * 
 * Subject - list of Observers, methods to register/deregister, methods to notify/update
 * Observer - method to set the object to watch, method to notify (used by subject)
 * 
 * Java provides a way to achieve this using Observer interface / Observable class
 *  eg. JMS, MVC ( Model - subject, Views - observer )
 */

public interface Observer
{
    String name();
    void update();
    void setSubject(final Subject subject);
}
