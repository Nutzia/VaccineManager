package generator;

import factory.VaccineFactory;
import person.Person;
import template.Vaccine;

import java.util.ArrayList;
import java.util.Random;

public class VaccineGenerator {
    public static final Random random = new Random();
    private VaccineFactory vaccineFactory = new VaccineFactory();
    private ArrayList<Vaccine> vaccines = new ArrayList();

    public void generate() {
        // clear vaccines before generating new ones
        vaccines.clear();

        int amountOfVaccines = random.nextInt(10) + 1;
        VaccineFactory.VaccineType[] vaccineTypes = VaccineFactory.VaccineType.values();

        for (int i = 0; i <= amountOfVaccines; i++) {
            VaccineFactory.VaccineType vaccineType = vaccineTypes[random.nextInt(vaccineTypes.length)];
            Vaccine vaccine = vaccineFactory.getVaccine(vaccineType);

            vaccines.add(vaccine);
        }
    }

    public ArrayList<Vaccine> getVaccines() {
        return this.vaccines;
    }
}
