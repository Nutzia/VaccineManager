package generator;
import person.Person;

import java.util.Random;

public class PersonGenerator {
    public static final Random random = new Random();
    private Person person;
    private String[] names = {"Garland","Edwardo","Socorro","Roselee","Tamala","Loura","Tempie","Nadine","Almeda","Delila","Shala","Lenard","Emeline","Stephaine","Conception","Brigette","Beata","Magdalen","Elliott","Brett"};

    public void generate() {
        String name = names[random.nextInt(names.length)];
        int age = random.nextInt(100);
        int idNo1 = random.nextInt(999999);
        int idNo2 = random.nextInt(999);
        int idNo3 = random.nextInt(99);

        String idNo = idNo1 + "-" + idNo2 + "-" + idNo3;

        person = new Person(name, age, idNo);
    }

    public Person getPerson() {
        return this.person;
    }
}
