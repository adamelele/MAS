public class Position {
    private final Employee employee;
    private final Company company;
    private String positionName;
    private String positionLevel;

    public Position(Employee employee, Company company, String positionName, String positionLevel){
        this.employee = employee;
        this.company = company;
        this.positionName = positionName;
        this.positionLevel = positionLevel;
        linkEmployeeCompany();
    }

    public void linkEmployeeCompany(){
        this.employee.linkPosition(this);
        this.company.linkPosition(this);
    }

    public void unlinkEmployeeCompany(){
        this.employee.unlinkPosition(this);
        this.company.unlinkPosition(this);
    }

}
