package template;

import exceptions.TooYoungException;
import person.Person;

public abstract class Vaccine {
    private Person patient;
    private int AGE_LIMIT = 16;

    public final void administerVaccine(Person patient) {
        this.patient = patient;

        try {
            register();
            inform();
            prepare();
            administer();
            aftercare();
        } catch (TooYoungException e) {
            System.out.println(e.getMessage());
        }
    }


    void register() throws TooYoungException {
        if (this.patient.age < AGE_LIMIT) {
            throw new TooYoungException("\tPatient: " + this.patient.name + " is too young (" + this.patient.age + "). Failed to register for vaccine.", new Throwable());
        }

        System.out.println("\tPatient: " + this.patient.name + "\n\tAge: " + this.patient.age + "\n\tIdentity number: " + this.patient.identityNumber);
    }
    abstract void inform();
    abstract void prepare();
    abstract void administer();
    abstract void aftercare();
}
