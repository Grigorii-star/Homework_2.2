public class Hogwarts {
    private String student;
    private int charmsSkills;
    private int transportationSkills;

    public Hogwarts(String student, int magicSkills, int transportationSkills) {
        this.student = student;
        this.charmsSkills = magicSkills;
        this.transportationSkills = transportationSkills;
    }

    public String getStudent() {
        return student;
    }

    public int getCharmsSkills() {
        return charmsSkills;
    }

    public void setCharmsSkills(int charmsSkills) {
        this.charmsSkills = charmsSkills;
    }

    public int getTransportationSkills() {
        return transportationSkills;
    }

    public void setTransportationSkills(int transportationSkills) {
        this.transportationSkills = transportationSkills;
    }

    public static void compairOfStudentsByMasterSkills(Hogwarts student1, Hogwarts student2) {
        int masterSkillsStudent1 = student1.getCharmsSkills() + student1.getTransportationSkills();
        int masterSkillsStudent2 = student2.getCharmsSkills() + student2.getTransportationSkills();
        System.out.println("Ученик Хогвартса " + student1.getStudent()
                + ": сила магии " + student1.getCharmsSkills()
                + " баллов, расстояние трансгрессии " + student1.getTransportationSkills()
                + " баллов. Общий показатель магического искусства = " + masterSkillsStudent1);
        System.out.println("Ученик Хогвартса " + student2.getStudent()
                + ": сила магии " + student2.getCharmsSkills()
                + " баллов, расстояние трансгрессии " + student2.getTransportationSkills()
                + " баллов. Общий показатель магического искусства = " + masterSkillsStudent2);
        if (masterSkillsStudent1 > masterSkillsStudent2) {
            System.out.println(student1.getStudent() + " обладает большей мощностью магии, чем " + student2.getStudent());
        } else {
            System.out.println(student2.getStudent() + " обладает большей мощностью магии, чем " + student1.getStudent());
        }
    }
}
