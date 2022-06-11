import java.util.Scanner;

public class Hogwarts {
    private String name;
    private String surname;

    private int magic;

    private int trans;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTrans() {
        return trans;
    }

    public void setTrans(int trans) {
        this.trans = trans;
    }

    public Hogwarts (String name, String surname, int magic, int trans){
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.trans = trans;
    }

    public static void PrintStudentInfo(Gryffindor student) {
                System.out.println("Имя: " + student.getName() +
                        ". Фамилия: " + student.getSurname() +
                        ". Качества студента. Владение магией: " + student.getMagic() +
                        ". Умение трансгресировать:" + student.getTrans() +
                        ". Дополнительные качества: Благородство: " + student.getNobility() +
                        ", Храбрость: " + student.getCourage() +
                        ", Честь: " + student.getHonor());
            };

    public static void PrintStudentInfo(Slytherin student){
        System.out.println("Имя: " + student.getName() +
                ". Фамилия: " + student.getSurname() +
                ". Качества студента. Владение магией: "+ student.getMagic() +
                ". Умение трансгресировать:" + student.getTrans() +
                ". Дополнительные качества: Хитрость: " + student.getSlyness() +
                ", Решительность : "  + student.getDetermination() + ", " +
                "Амбициозность: " + student.getAmbition() +
                ", Находчивость: " + student.getInventive() +
                ", Жажда власти: " + student.getLustForPower());
    };

    public static void PrintStudentInfo(Hufflepuff student){
        System.out.println("Имя: " + student.getName() +
                ". Фамилия: " + student.getSurname() +
                ". Качества студента. Владение магией: "+ student.getMagic() +
                ". Умение трансгресировать:" + student.getTrans() +
                ". Дополнительные качества: Трудолюбие: " + student.getHardworking() +
                ", Верность : "  + student.getLoyal() + ", " +
                "Честность: " + student.getHonest());
    };

    public static void PrintStudentInfo(Ravenclaw student){
        System.out.println("Имя: " + student.getName() +
                ". Фамилия: " + student.getSurname() +
                ". Качества студента. Владение магией: "+ student.getMagic() +
                ". Умение трансгресировать:" + student.getTrans() +
                ". Дополнительные качества: Интеллект: " + student.getClever() +
                ", Мудрость : "  + student.getWise() + ", " +
                "Остроумие: " + student.getWitty() + ", Творчество" + student.getArt());
    };



    public static void CompareStudentsInHouse (Gryffindor studentToCompare1, Gryffindor studentToCompare2) {

        int sum = studentToCompare1.getNobility() + studentToCompare1.getHonor() + studentToCompare1.getCourage() + studentToCompare1.getTrans() + studentToCompare1.getMagic();
        int sum1 = studentToCompare2.getNobility() + studentToCompare2.getHonor() + studentToCompare2.getCourage() + studentToCompare2.getTrans() + studentToCompare2.getMagic();
        if (sum > sum1) {
            System.out.println(studentToCompare1.getName() + " лучший Грифиндорец, чем - " + studentToCompare2.getName());
        } else {
            System.out.println(studentToCompare2.getName() + " лучший Грифиндорец, чем - " + studentToCompare1.getName());
        }

        }

    public static void CompareStudentsInHouse (Slytherin studentToCompare1, Slytherin studentToCompare2) {

        int sum = studentToCompare1.getAmbition() + studentToCompare1.getDetermination() + studentToCompare1.getInventive() + studentToCompare1.getTrans() + studentToCompare1.getMagic() + studentToCompare1.getLustForPower() + studentToCompare1.getSlyness();
        int sum1 = studentToCompare2.getAmbition() + studentToCompare2.getDetermination() + studentToCompare2.getInventive() + studentToCompare2.getTrans() + studentToCompare2.getMagic() + studentToCompare2.getLustForPower() + studentToCompare2.getSlyness();
        if (sum > sum1) {
            System.out.println(studentToCompare1.getName() + " лучший Слизиринец, чем - " + studentToCompare2.getName());
        } else {
            System.out.println(studentToCompare2.getName() + " лучший Слизиринец, чем - " + studentToCompare1.getName());
        }
    }

    public static void CompareStudentsInHouse (Hufflepuff studentToCompare1, Hufflepuff studentToCompare2) {

        int sum = studentToCompare1.getHardworking() + studentToCompare1.getHonest() + studentToCompare1.getLoyal() + studentToCompare1.getTrans() + studentToCompare1.getMagic();
        int sum1 = studentToCompare2.getHardworking() + studentToCompare2.getHonest() + studentToCompare2.getLoyal() + studentToCompare2.getTrans() + studentToCompare2.getMagic();
        if (sum > sum1) {
            System.out.println(studentToCompare1.getName() + " лучший Пуфиндуец, чем - " + studentToCompare2.getName());
        } else {
            System.out.println(studentToCompare2.getName() + " лучший Пуфиндуец, чем - " + studentToCompare1.getName());
        }
    }

    public static void CompareStudentsInHouse (Ravenclaw studentToCompare1, Ravenclaw studentToCompare2) {

        int sum = studentToCompare1.getArt() + studentToCompare1.getClever() + studentToCompare1.getWise() + studentToCompare1.getTrans() + studentToCompare1.getMagic() + studentToCompare1.getWitty();
        int sum1 = studentToCompare1.getArt() + studentToCompare1.getClever() + studentToCompare1.getWise() + studentToCompare1.getTrans() + studentToCompare1.getMagic() + studentToCompare1.getWitty();
        if (sum > sum1) {
            System.out.println(studentToCompare1.getName() + " лучший Когтевранец, чем - " + studentToCompare2.getName());
        } else {
            System.out.println(studentToCompare2.getName() + " лучший Когтевранец, чем - " + studentToCompare1.getName());
        }
    }

    public static void CompareStudentsInHogwarts (Hogwarts student1, Hogwarts student2) {

        int sum = student1.getMagic() + student1.getTrans();
        int sum1 = student2.getMagic() + student2.getTrans();
        if (sum > sum1) {
            System.out.println(student1.getName() + " лучше ученик Хогвартса, чем - " + student2.getName());
        } else {
            System.out.println(student2.getName() + " круче, чем - " + student1.getName());
        }

    }

    }

