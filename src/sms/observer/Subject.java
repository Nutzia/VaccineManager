package sms.observer;

import java.util.ArrayList;

public interface Subject {
    public void attach(Observer observer);
    public ArrayList<Message> notifyAllObservers(ArrayList<Message> m);
}
