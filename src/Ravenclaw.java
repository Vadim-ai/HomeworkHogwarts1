public class Ravenclaw extends Hogwarts {
    private int clever;
    private int wise;
    private int witty;
    private int art;

    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }

    public Ravenclaw (String name,
                      String surname,
                      int magic,
                      int trans,
                      int clever,
                      int wise,
                      int witty,
                      int art){
        super (name, surname, magic, trans);
        this.clever = clever ;
        this.wise = wise ;
        this.witty = witty ;
        this.art = art;
    }
}