public class Assistant extends Professor{
    private String profession;

    public Assistant(String name, int age, String profession,String gender,HobbyEnum hobby, University university) {
        super(name, age, gender, hobby, university);
        this.profession = profession;
    }



    public String getProfession() {
        return profession;
    }

    @Override
    public void teachStudents() {
        super.teachStudents();
    }

    public String getInfo() {
        return super.getInfo() +
                "\nProfession" + profession;
    }
}
