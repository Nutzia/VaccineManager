package template;

public class DTP extends Vaccine{
    @Override
    void inform(){
        System.out.println("Inform: \n\t" + "Handed brochure for " + "DTP " + "to patient");
    }
    @Override
    void prepare() {
        System.out.println("Prepare: " + "\n\t mix vaccine with water" + "\n\t pour the solution into a glass");
    }

    @Override
    void administer() {
        System.out.println("Administer: " + "\n\t patient drinks at least half the solution");
    }

    @Override
    void aftercare() {
        System.out.println("Aftercare: " + "\n\t patient drinks a full glass of water" + "\n\t patient waits for 15 minutes" + "\n\t Doctor registers the vaccine with vaccine.com");
    }

    @Override
    public String toString() {
        return " DTP";
    }
}
