package Kiet;

public class EmployeeKIET {
    
    public String Emp_Name;
    private int Salary;
    protected int Emp_id;
    String Organisation;

    void employeeDetails(){
        System.out.println("Details of KIet Employee are:" +"\n" + Emp_id+" "+Emp_Name+" "+Salary+" "+Organisation);
    }

    public static void main(String[] args){
        EmployeeKIET ek=new EmployeeKIET();
        ek.Emp_Name="Divya";
        ek.Emp_id=1;
        ek.Salary=2000000;
        
    }
}
