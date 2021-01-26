package template;

public class HepatitisB extends Vaccine{
    @Override
    void inform(){
        System.out.println("Inform: \n\t" + "Handed brochure for " + "hepatitis B " + "to patient");
    }
    @Override
    void prepare() {
        System.out.println("Prepare: " + "\n\t heat up vaccine" + "\n\t disinfect patient's arm");
    }

    @Override
    void administer() {
        System.out.println("Administer: " + "\n\t vaccine is injected into right arm");
    }

    @Override
    void aftercare() {
        System.out.println("Aftercare: " + "\n\t band-aid is put on" + "\n\t patient waits for 10 minutes" + "\n\t Doctor registers the vaccine with vaccine.com");
    }

    @Override
    public String toString() {
        return " hepatitis B";
    }
}
