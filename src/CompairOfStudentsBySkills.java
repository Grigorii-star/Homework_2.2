public class CompairOfStudentsBySkills {
    public void compairOfStudentsGryffindor(Gryffindor student1, Gryffindor student2) {
        int skillsStudent1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int skillsStudent2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        System.out.println("Навыки ученика Гриффиндора " + student1.getStudent() + " = " + skillsStudent1 + " баллов");
        System.out.println("Навыки ученика Гриффиндора " + student2.getStudent() + " = " + skillsStudent2 + " баллов");
        if (skillsStudent1 > skillsStudent2) {
            System.out.println(student1.getStudent() + " лучший гриффиндорец, чем " + student2.getStudent());
        } else {
            System.out.println(student2.getStudent() + " лучший гриффиндорец, чем " + student1.getStudent());
        }
        System.out.println();
    }

    public void compairOfStudentsHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        int skillsStudent1 = student1.getIndustriousness() + student1.getLoyalty() + student1.getHonesty();
        int skillsStudent2 = student2.getIndustriousness() + student2.getLoyalty() + student2.getHonesty();
        System.out.println("Навыки ученика Пуффендуя " + student1.getStudent() + " = " + skillsStudent1 + " баллов");
        System.out.println("Навыки ученика Пуффендуя " + student2.getStudent() + " = " + skillsStudent2 + " баллов");
        if (skillsStudent1 > skillsStudent2) {
            System.out.println(student1.getStudent() + " лучший пуффендуец, чем " + student2.getStudent());
        } else {
            System.out.println(student2.getStudent() + " лучший пуффендуец, чем " + student1.getStudent());
        }
        System.out.println();
    }

    public void compairOfStudentsRavenclaw(Ravenclaw student1, Ravenclaw student2) {
        int skillsStudent1 = student1.getCleverness() + student1.getWisdom() + student1.getWit() + student1.getCreation();
        int skillsStudent2 = student2.getCleverness() + student2.getWisdom() + student2.getWit() + student2.getCreation();
        System.out.println("Навыки ученика Когтеврана " + student1.getStudent() + " = " + skillsStudent1 + " баллов");
        System.out.println("Навыки ученика Когтеврана " + student2.getStudent() + " = " + skillsStudent2 + " баллов");
        if (skillsStudent1 > skillsStudent2) {
            System.out.println(student1.getStudent() + " лучший когтевранец, чем " + student2.getStudent());
        } else {
            System.out.println(student2.getStudent() + " лучший когтевранец, чем " + student1.getStudent());
        }
        System.out.println();
    }

    public void compairOfStudentsSlytherin(Slytherin student1, Slytherin student2) {
        int skillsStudent1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getLustForPower();
        int skillsStudent2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getLustForPower();
        System.out.println("Навыки ученика Слизерина " + student1.getStudent() + " = " + skillsStudent1 + " баллов");
        System.out.println("Навыки ученика Слизерина " + student2.getStudent() + " = " + skillsStudent2 + " баллов");
        if (skillsStudent1 > skillsStudent2) {
            System.out.println(student1.getStudent() + " лучший слизеринец, чем " + student2.getStudent());
        } else {
            System.out.println(student2.getStudent() + " лучший слизеринец, чем " + student1.getStudent());
        }
        System.out.println();
    }

    public void compairOfStudenrsByMasterSkills(Hogwarts student1, Hogwarts student2) {

    }
}
