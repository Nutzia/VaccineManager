package sms.observer;

import sms.generator.MessageGenerator;

import java.util.ArrayList;
import java.util.List;

public class MessageSender implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private ArrayList<Message> messages = new ArrayList();
    MessageGenerator mg = new MessageGenerator();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public ArrayList<Message> notifyAllObservers(ArrayList<Message> m){
        for (Observer observer : observers) {
            ArrayList<Message> messages = mg.getMessage();
            observer.update(messages);
        }
        return messages;
    }
}
