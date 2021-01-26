package sms.observer;

import java.util.ArrayList;

public class MessageSubscriber implements Observer {

    @Override
    public void update(ArrayList<Message> m) {
        //Hier loopt er nog iets mis met het printen, denk ik??
        System.out.println("Message: " + m.toString());
    }
}
