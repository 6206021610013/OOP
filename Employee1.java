public class Employee1 {
    private int empId;
    private String empName;
    private double empSalary;
    private String empTimeIn;
    private String empTimeOut;
    // constuctor methods
    public Employee1() {
    }

    public Employee1(int empId , String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public Employee1(int empId, String empName,double empSalary, String empTimeIn, String empTimeOut)
    {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empTimeIn = empTimeIn;
        this.empTimeOut = empTimeOut;
    }
    // mutator methods
    public void setEmpId(int empId)
    {
        this.empId = empId;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public void setEmpSalary(double empSalary)
    {
        this.empSalary = empSalary;
    }

    public void setEmpTimeIn(String empTimeIn)
    {
        this.empTimeIn = empTimeIn;
    }

    public void setEmpTimeOut(String empTimeOut)
    {
        this.empTimeOut = empTimeOut;
    }

    // constuctor methods
    public int getEmpId()
    {
        return(this.empId);
    }

    public String getEmpName()
    {
        return(this.empName);
    }

    public double getEmpSalary()
    {
        return(this.empSalary);
    }

    public String getEmpTimeIn()
    {
        return(this.empTimeIn);
    }

    public String getEmpTimeOut()
    {
        return(this.empTimeOut);
    }

    // facilites methods
    public String toString()
    {
        String str;
        str = getEmpId() + ", " + getEmpName() + ", " + getEmpSalary();
        str += ", " + getEmpTimeIn() + ", " + getEmpTimeOut();
        return(str);
    }
}
