//overloading

class EmployeePoly{
    String Emp_name;

    //no para
    void details(){
        System.out.println("Name: "+Emp_name);
    }
    //added 1 para
    void details(int salary){
        System.out.println("Salary: "+salary);
    }
    //type of para is diff
    void details(String company){
        System.out.println("Company: "+company);
    }
    //order can be change too
     void details(int salary,String company){
        System.out.println("Salary: "+salary +"Company: "+company);
    }
    void details(String company,int salary){
        System.out.println("Company: "+company +"Salary: "+salary );
    }
}

//faculty == child of Employee poly
class Faculty extends EmployeePoly{
    //exact same bs kaam alg h

    void details(){
        super.details();
        System.out.println(" Welcome ! ");
    }

}
public class polymorphism {
    public static void main(String[] args) {
        // EmployeePoly ep=new EmployeePoly();
        // ep.Emp_name="Tanya";
        // ep.details();
        // ep.details(3000000);
        // ep.details("Kiet");



        //faculty class ka obj i.e, child ka obj
        Faculty fc=new Faculty();
        fc.Emp_name="Tanya";
        fc.details();
    }
}
//polymorphism allows us to perform a single action in diff ways i,e define once implement multiple time
//types: Compile time(overloading) and Run time(overriding)
//overloading btw same class para can be diff
//overresding diff class and exact method same para
//Method overloading:multiple fn with same name but diff para
//overriding : if subclass (child class) has same method as declared in parent class
//Rules for overriding: 


// to run :
//  javac polymorphism.java
//java polymorphism