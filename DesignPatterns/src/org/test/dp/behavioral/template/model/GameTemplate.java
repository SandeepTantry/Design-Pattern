package org.test.dp.behavioral.template.model;

/**
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods.
 * Its subclasses can override the method implementation as per need,
 * but the invocation is to be in the same way as defined by an abstract class.
 * This is used to create a method stub and deferring some of the steps of implementation to the subclasses
 * 
 * eg. All non-abstract methods of AbstractList, AbstractSet, AbstractMap, Reader, Writer, InputStream, OutputStream...
 * 
 * 1. Template method should consists of certain steps whose order is fixed and for some of the methods,
 *    implementation differs from base class to subclass. Template method should be final.
 * 2. Most of the times, subclasses calls methods from super class but in template pattern,
 *    superclass template method calls methods from subclasses, this is known as Hollywood Principle – “don’t call us, we’ll call you.”.
 * 3. Methods in base class with default implementation are referred as "Hooks" and they are intended to be overridden by subclasses,
 *    if you want some of the methods to be not overridden, you can make them final.
 */

// NOTE : after Java 8, this need not be abstract class. Interface can have default
public abstract class GameTemplate
{
    // template/stub method. should be final
    public final void playGame()
    {
        loadGame();
        startPlay();
        endGame();
    }
    
    abstract void loadGame();
    abstract void startPlay();
    abstract void endGame();
}
