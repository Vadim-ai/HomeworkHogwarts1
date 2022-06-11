public class Hufflepuff extends Hogwarts {

    private int hardworking;
    private int loyal;
    private int honest;

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public Hufflepuff (String name,
                       String surname,
                       int magic,
                       int trans,
                       int hardworking,
                       int loyal,
                       int honest ){
        super (name, surname, magic, trans);
        this.hardworking = hardworking ;
        this.loyal = loyal ;
        this.honest = honest;
    }

}
