public class Main {
    public static void main(String[] args) {


             Gryffindor student1 = new Gryffindor("Гарри", "Поттер", 75, 25, 89, 95, 80);
             Gryffindor student2 = new Gryffindor("Гермиона", "Грейнджер", 99, 70, 70, 80, 82);
             Gryffindor student3 = new Gryffindor("Рон", "Уизли", 60, 20, 36, 87, 90);


             Slytherin student4 = new Slytherin("Драко", "Малфой", 75, 60, 97, 66, 44, 54, 88);
             Slytherin student5 = new Slytherin("Грехем", "Монтегю", 70, 68, 20, 53, 55, 25, 49);
             Slytherin student6 = new Slytherin("Грегори", "Гойл", 45, 66, 77, 33, 12, 45, 66);



             Hufflepuff student7 = new Hufflepuff("Захария", "Смит", 34, 45, 77, 59, 90);
             Hufflepuff student8 = new Hufflepuff("Седрик", "Дигори", 99, 80, 90, 60, 80);
             Hufflepuff student9 = new Hufflepuff("Джастин", "Финч-Флетчли", 58, 50, 67, 77, 89);



             Ravenclaw student10 = new Ravenclaw("Чжоу", "Чанг", 32, 77, 78, 33, 68, 99);
             Ravenclaw student11 = new Ravenclaw("Падма", "Патил", 77, 72, 71, 39, 63, 94);
             Ravenclaw student12 = new Ravenclaw("Маркус", "Белби", 37, 87, 73, 34, 65, 96);


        Hogwarts.PrintStudentInfo(student1);
        Hogwarts.PrintStudentInfo(student4);
        Hogwarts.PrintStudentInfo(student7);
        Hogwarts.PrintStudentInfo(student11);

        Hogwarts.CompareStudentsInHouse(student1,student2);
        Hogwarts.CompareStudentsInHouse(student5,student6);
        Hogwarts.CompareStudentsInHouse(student8,student9);
        Hogwarts.CompareStudentsInHouse(student11,student12);

        Hogwarts.CompareStudentsInHogwarts(student1,student5);

}
}