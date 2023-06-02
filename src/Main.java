public class Main {
    public static void main(String[] args) {
        Gryffindor gryffindorStudent1 = new Gryffindor("Гарри Поттер", 90, 65, 90, 95, 90);
        Gryffindor gryffindorStudent2 = new Gryffindor("Гермиона Грейнджер", 95, 90, 80, 75, 85);
        Gryffindor gryffindorStudent3 = new Gryffindor("Рон Уизли", 45, 30, 75, 80, 65);

        Hufflepuff hufflepuffStudent1 = new Hufflepuff("Захария Смит", 55, 60, 65, 75, 80);
        Hufflepuff hufflepuffStudent2 = new Hufflepuff("Седрик Диггори", 90, 87, 90, 95, 100);
        Hufflepuff hufflepuffStudent3 = new Hufflepuff("Джастин Финч-Флетчли", 75, 65, 72, 77, 80);

        Ravenclaw ravenclawStudent1 = new Ravenclaw("Чжоу Чанг", 65, 70, 75, 70, 80, 85);
        Ravenclaw ravenclawStudent2 = new Ravenclaw("Падма Патил", 55, 45, 80, 85, 90, 100);
        Ravenclaw ravenclawStudent3 = new Ravenclaw("Маркус Белби", 70, 50, 60, 50, 45, 47);

        Slytherin slytherinStudent1 = new Slytherin("Драко Малфой", 78, 80, 90, 95, 100, 70, 100);
        Slytherin slytherinStudent2 = new Slytherin("Грэхэм Монтегю", 65, 70, 72, 65, 70, 50,70);
        Slytherin slytherinStudent3 = new Slytherin("Грегори Гойл", 70,65,55, 45, 50, 55, 40);

        PrintStudentsStatistics printStudentsStatistics = new PrintStudentsStatistics();
        printStudentsStatistics.printGriffindorStatistics(gryffindorStudent1);
        printStudentsStatistics.printHufflepuffStatistics(hufflepuffStudent1);
        printStudentsStatistics.printRavenclawStatistics(ravenclawStudent1);
        printStudentsStatistics.printSlythernStatistics(slytherinStudent1);

        CompairOfStudentsBySkills compairOfStudentsBySkills = new CompairOfStudentsBySkills();
        compairOfStudentsBySkills.compairOfStudentsGryffindor(gryffindorStudent1, gryffindorStudent2);
        compairOfStudentsBySkills.compairOfStudentsHufflepuff(hufflepuffStudent1, hufflepuffStudent2);
        compairOfStudentsBySkills.compairOfStudentsRavenclaw(ravenclawStudent1, ravenclawStudent2);
        compairOfStudentsBySkills.compairOfStudentsSlytherin(slytherinStudent1, slytherinStudent2);
        Hogwarts.compairOfStudentsByMasterSkills(gryffindorStudent1, slytherinStudent1);
    }
}