public class Ravenclaw extends Hogwarts{
    private int cleverness;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String student, int charmsSkills, int transportationSkills, int cleverness, int wisdom, int wit, int creation) {
        super(student, charmsSkills, transportationSkills);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}
