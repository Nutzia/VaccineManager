package test;

import generator.PersonGenerator;
import generator.VaccineGenerator;
import template.Vaccine;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class TestVaccineManager {
    VaccineGenerator vg = new VaccineGenerator();
    PersonGenerator pg = new PersonGenerator();

    public static void main(String[] args) {
        TestVaccineManager tvm = new TestVaccineManager();

        tvm.generate();
        tvm.print();
    }

    // generate vaccines
    public void generate() {
        vg.generate();
    }

    // print vaccines
    public void print() {
        ArrayList<Vaccine> vaccines = vg.getVaccines();

        AtomicInteger index = new AtomicInteger();
        // arrow function
        vaccines.forEach(vaccine -> {
            System.out.println("\nVaccine " + (index.getAndIncrement() + 1) + ": " + vaccine.toString());
            pg.generate();
            vaccine.administerVaccine(pg.getPerson());
        });
    }
}
