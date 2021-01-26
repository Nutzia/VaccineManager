package factory;

import person.Person;
import template.*;

public class VaccineFactory {
    private static Vaccine vaccine;
    public static enum VaccineType {
        COVID19("Covid-19"),
        DTP("DTP"),
        HEPATITIS_B("Hepatitis B"),
        INFLUENZA("Influenza");

        private String type;

        VaccineType(String type) {
            this.type = type;
        }
    }

    public static Vaccine getVaccine(VaccineType vaccineType) {
        switch(vaccineType) {
            case COVID19:
                vaccine = new Covid19();
                break;
            case DTP:
                vaccine = new DTP();
                break;
            case HEPATITIS_B:
                vaccine = new HepatitisB();
                break;
            case INFLUENZA:
                vaccine = new Influenza();
                break;
        }

        return vaccine;
    }
}
