package factory;

import generator.PersonGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import person.Person;
import template.*;

import static org.junit.Assert.*;

public class VaccineFactoryTest {
    private static VaccineFactory vf;
    private static Vaccine v;

    @BeforeClass
    public static void setUp() {
        vf = new VaccineFactory();
        //executed only once, before the first test
    }

    @Test
    public void getCovidVaccine() {
        v = vf.getVaccine(VaccineFactory.VaccineType.COVID19);

        Assert.assertTrue(v instanceof Covid19);
    }

    @Test
    public void getInfluenzaVaccine() {
        v = vf.getVaccine(VaccineFactory.VaccineType.INFLUENZA);

        Assert.assertTrue(v instanceof Influenza);
    }

    @Test
    public void getHepatitisBVaccine() {
        v = vf.getVaccine(VaccineFactory.VaccineType.HEPATITIS_B);

        Assert.assertTrue(v instanceof HepatitisB);
    }

    @Test
    public void getDTPVaccine() {
        v = vf.getVaccine(VaccineFactory.VaccineType.DTP);

        Assert.assertTrue(v instanceof DTP);
    }
}