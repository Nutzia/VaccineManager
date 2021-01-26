package template;

public class Covid19 extends Vaccine{
    @Override
    void inform(){
        System.out.println("Inform: \n\t" + "Handed brochure for " + "covid 19 " + "to patient");
    }
    @Override
    void prepare() {
        System.out.println("Prepare: " + "\n\t defrost vaccine" + "\n\t disinfect patient's arm" + "\n\t check patient's basic vitals");
    }

    @Override
    void administer() {
        System.out.println("Administer: " + "\n\t vaccine is injected into left arm");
    }

    @Override
    void aftercare() {
        System.out.println("Aftercare: " + "\n\t band-aid is put on" + "\n\t patient waits for 15 minutes" + "\n\t Doctor registers the vaccine with vaccine.com");
    }

    @Override
    public String toString() {
        return " covid-19";
    }
}
