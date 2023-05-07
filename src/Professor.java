public class Professor extends Person{
    private String name;
    private int age;

    public Professor(String name,int age, String gender,HobbyEnum hobby, University university) {
        super(gender,hobby,university);
        this.name = name;
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void teachStudents(){
        System.out.println("Пройти лекцию первым курсам");
    }
    public void teachStudents(String teach){
        System.out.println(teach);
    }
    public final void study(){
        System.out.println("Изучить дополнительные материалы");
    }
    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nAge: " + age;
    }
}
