package Dynamic;

public class Student extends Person{

    String schoolName;
    double tuition;
    double income;

    public Student(String schoolName, double tuition, double income, String firstName, String secondName) {
        super(firstName,secondName);
        this.schoolName = schoolName;
        this.tuition = tuition;
        this.income = income;
    }

    public Student(Employee employee, String schoolName, double tuition, double income) {
        super(employee.getFirstName(), employee.getSecondName());
        this.schoolName = schoolName;
        this.tuition = tuition;
        this.income = income;
        employee = null;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public double getNetIncome() {
        return income-tuition;
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolName='" + schoolName + '\'' +
                ", tuition=" + tuition +
                ", income=" + income +
                '}';
    }
}
