public class Person {
    private String gender;

    private HobbyEnum hobby;
    private University university;

    public Person(String gender, HobbyEnum hobby, University university) {
        this.gender = gender;
        this.hobby = hobby;
        this.university = university;
    }

    public String getGender() {
        return gender;
    }

    public HobbyEnum getHobby() {
        return hobby;
    }

    public University getUniversity() {
        return university;
    }

    public String getInfo() {
        return "\nGender: " + getGender() +
                "\nHobby: " + getHobby() +
                "\nUniversity name: " + university.getNameOfUni() +
                "\nUniversity address: " + university.getAddress();
    }
}
