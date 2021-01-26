package generator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import person.Person;

import static org.junit.Assert.*;

public class VaccineGeneratorTest {

    @Test
    public void ShouldCreateVaccines() {
        VaccineGenerator vg = new VaccineGenerator();

        vg.generate();

        Assert.assertNotNull(vg.getVaccines());
        Assert.assertTrue(vg.getVaccines().size() > 0);
    }
}