package sms.test;

import sms.generator.MessageGenerator;
import sms.observer.Message;
import sms.observer.MessageSender;
import sms.observer.MessageSubscriber;

import java.util.ArrayList;

public class TestSms {
    MessageGenerator mg = new MessageGenerator();

    public static void main(String[] args) {
        TestSms ts = new TestSms();

        //ts.generate();
        //ts.print();

        MessageSubscriber sub = new MessageSubscriber();
        MessageSender send = new MessageSender();

        send.attach(sub);

        send.notifyAllObservers(ts.print());
    }

    public void generate() { mg.generate(); }

    public ArrayList<Message> print() {
        ArrayList<Message> messages = mg.getMessage();
        // arrow function
        messages.forEach(message -> {
            System.out.println( mg.getMessage());
        });
        return messages;
    }
}
