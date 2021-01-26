package sms.generator;

import sms.observer.Message;

import java.util.ArrayList;
import java.util.Random;

public class MessageGenerator {
    public static final Random random = new Random();
    private ArrayList<Message> messages = new ArrayList();
    private Message message;
    private String[] names = {"Garland","Edwardo","Socorro","Roselee","Tamala","Loura","Tempie","Nadine","Almeda","Delila","Shala","Lenard","Emeline","Stephaine","Conception","Brigette","Beata","Magdalen","Elliott","Brett"};
    private String[] locations = {"London","Tokio","Madrid","Paris","New York","Brussels","Berlin","Stockholm"};

    public void generate() {
        String name = names[random.nextInt(names.length)];
        String location = locations[random.nextInt(locations.length)];

        //message = new Message("");

        int amountOfMessages = random.nextInt(10) + 1;

        for (int i = 0; i <= amountOfMessages; i++) {
            message = new Message(name.toString() + ", you are expected at" + location.toString() + "for your vaccination." );

            messages.add(message);
        }
    }
    public ArrayList<Message> getMessage() {
        return this.messages;
    }
}
