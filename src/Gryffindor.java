public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public Gryffindor (String name,
                       String surname,
                       int magic,
                       int trans,
                       int nobility,
                       int honor,
                       int courage){
        super (name, surname, magic, trans);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

}