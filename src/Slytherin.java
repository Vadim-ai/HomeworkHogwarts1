public class Slytherin extends Hogwarts {
    private int slyness;
    private int determination;
    private int ambition;
    private int inventive;
    private int lustForPower;

    public int getSlyness() {
        return slyness;
    }

    public void setSlyness(int slyness) {
        this.slyness = slyness;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getInventive() {
        return inventive;
    }

    public void setInventive(int inventive) {
        this.inventive = inventive;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public Slytherin (String name,
                      String surname,
                      int magic,
                      int trans,
                      int slyness,
                      int determination,
                      int ambition,
                      int inventive,
                      int lustForPower ){
        super (name, surname, magic, trans);
        this.slyness = slyness;
        this.determination = determination;
        this.ambition = ambition;
        this.inventive = inventive;
        this.lustForPower = lustForPower;
    }
}
