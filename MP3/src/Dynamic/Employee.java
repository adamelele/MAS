package Dynamic;

public class Employee extends Person {
    private String jobTitle;
    private double salary;

    public Employee(String jobTitle, double salary, String firstName, String secondName) {
        super(firstName, secondName);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(Student student, String jobTitle, double salary) {
        super(student.getFirstName(), student.getSecondName());
        this.jobTitle = jobTitle;
        this.salary = salary;
        student=null;

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getNetIncome() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
