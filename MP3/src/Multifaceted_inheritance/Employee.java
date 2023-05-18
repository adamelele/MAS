package Multifaceted_inheritance;

public class Employee extends Person{

    private String jobTitle;

    public Employee(String name, int age, char sex, String maidenName, Boolean militaryService, String jobTitle) {
        super(name, age, sex, maidenName, militaryService);
        this.jobTitle = jobTitle;
    }

    @Override
    public void introduce() {
        System.out.println("Employee." +
                "\nName: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Sex: " + getSex());
        System.out.println("Job title: " + jobTitle );
    }
}
