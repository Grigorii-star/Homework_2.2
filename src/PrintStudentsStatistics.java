public class PrintStudentsStatistics {
    public void printGriffindorStatistics(Gryffindor student) {
        System.out.println("Факультет Гриффиндор:");
        System.out.println("Имя: " + student.getStudent() + "; "
                + "Уровень колдовства: " + student.getCharmsSkills() + "; "
                + "Трангрессия: " + student.getTransportationSkills() + "; "
                + "Благородство: " + student.getNobility() + "; "
                + "Честь: " + student.getHonor() + "; "
                + "Храбрость: " + student.getBravery());
        System.out.println();
    }

    public void printHufflepuffStatistics(Hufflepuff student) {
        System.out.println("Факультет Пуффендуй:");
        System.out.println("Имя: " + student.getStudent() + "; "
                + "Уровень колдовства: " + student.getCharmsSkills() + "; "
                + "Трангрессия: " + student.getTransportationSkills() + "; "
                + "Трудолюбие: " + student.getIndustriousness() + "; "
                + "Верность: " + student.getLoyalty() + "; "
                + "Честность: " + student.getHonesty());
        System.out.println();
    }

    public void printRavenclawStatistics(Ravenclaw student) {
        System.out.println("Факультет Когтевран:");
        System.out.println("Имя: " + student.getStudent() + "; "
                + "Уровень колдовства: " + student.getCharmsSkills() + "; "
                + "Трангрессия: " + student.getTransportationSkills() + "; "
                + "Ум: " + student.getCleverness() + "; "
                + "Мудрость: " + student.getWisdom() + "; "
                + "Остроумие: " + student.getWit() + "; "
                + "Творчество: " + student.getCreation());
        System.out.println();
    }

    public void printSlythernStatistics(Slytherin student) {
        System.out.println("Факультет Слизерин:");
        System.out.println("Имя: " + student.getStudent() + "; "
                + "Уровень колдовства: " + student.getCharmsSkills() + "; "
                + "Трангрессия: " + student.getTransportationSkills() + "; "
                + "Хитрость: " + student.getCunning() + "; "
                + "Решительность: " + student.getDetermination() + "; "
                + "Амбициозность: " + student.getAmbition() + "; "
                + "Находчивость: " + student.getResourcefulness() + "; "
                + "Жажда власти: " + student.getLustForPower());
        System.out.println();
    }
}
