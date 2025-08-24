package Abes;
import Kiet.*;
// to use other package class we have to import other package
public class EmployeeABES extends EmployeeKIET{
    public static void main(String[] args) {
        // when we dont use extends EmployeeKIET
        // EmployeeKIET ek=new EmployeeKIET(); 
        
        // ek.Emp_Name="Shikha";
        // ek.Emp_id=102;  out of scope private
        // ek.Salary=200000; protected
        // ek.Organisation="Abes org"; default


        //when we use e extends EmployeeKIET
        EmployeeABES ae=new EmployeeABES();
        ae.Emp_Name="Shikha";
        //now id can be use that is private
        ae.Emp_id=102; 

        //Salary and org abhi bhi nahi hoga
        // ae.Salary=2000000;
        // ae.Organisation="abes";
        
    }
}
