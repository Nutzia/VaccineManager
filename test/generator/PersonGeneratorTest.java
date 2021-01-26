package generator;

import org.junit.Assert;
import org.junit.Test;
import person.Person;

import static org.junit.Assert.*;

public class PersonGeneratorTest {

    @Test
    public void ShouldCreatePerson() {
        PersonGenerator pg = new PersonGenerator();

        pg.generate();

        Assert.assertNotNull(pg.getPerson());
        Assert.assertTrue(pg.getPerson() instanceof Person);

        //String name = "hello";
        //int age = 23;
        //String id = "123456-123-12";

        //Person person = new Person(name, age, id);

        //Assert.assertEquals("hello", "23", "123456-123-12");
    }

    @Test
    public void getPerson() {
    }
}