package Multifaceted_inheritance;

public class Student extends Person {

    private String schoolName;

    public Student(String name, int age, char sex, String maidenName, Boolean militaryService, String schoolName) {
        super(name, age, sex, maidenName, militaryService);
        this.schoolName = schoolName;
    }

    @Override
    public void introduce() {
        System.out.println("Student." +
                "\nName: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Sex: " + getSex());
        System.out.println("School name: " + schoolName );
    }
}
