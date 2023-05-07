public class Main {
    public static void main(String[] args) {
        University university= new University("Harvard" , "Oxford street");
        Professor professor=new Professor("Beddington",48, "man",HobbyEnum.Collecting, university);
        Assistant assistant1=new Assistant("Emily",26,"Chemist","woman",HobbyEnum.Drawing,university);
        Assistant assistant2=new Assistant("Djon", 23, "Chemist","man",HobbyEnum.Pottery,university);
        System.out.println(professor.getInfo());
        professor.teachStudents();
        professor.teachStudents("Пройти лекцию вторым курсам");
        professor.teachStudents("Пройти лекцию четвертым курсам");
        professor.study();
        System.out.println(assistant1.getInfo());
        assistant1.teachStudents();
        assistant1.study();
        System.out.println(assistant2.getInfo());
        assistant2.teachStudents("Пройти лекцию третим курсам");
        assistant2.study();
    }
}