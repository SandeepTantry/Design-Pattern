package org.test.dp.behavioral.observer.test;

import org.test.dp.behavioral.observer.model.MyTopic;
import org.test.dp.behavioral.observer.model.MyTopicObserver;
import org.test.dp.behavioral.observer.model.Observer;
import org.test.dp.behavioral.observer.model.Subject;

public class ObserverPatternTester
{
    public static void main(String[] args)
    {
        final Observer topic1 = new MyTopicObserver("subscriber1");
        final Observer topic2 = new MyTopicObserver("subscriber2");
        final Observer topic3 = new MyTopicObserver("subscriber3");
        
        final Subject subject = new MyTopic();
        subject.register(topic1);
        subject.register(topic2);
        subject.register(topic3);
        
        topic1.setSubject(subject);
        topic2.setSubject(subject);
        topic3.setSubject(subject);
        
        subject.notifyObservers(); // directly calling will have no effect 
        topic1.update();
        
        String msg = "New article released";
        System.out.println();
        subject.postMessage(msg);
        
        System.out.println();
        topic1.update();
        subject.notifyObservers(); // directly calling will have no effect
    }
}
