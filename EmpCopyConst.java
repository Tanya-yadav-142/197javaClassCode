
public class EmpCopyConst {
    int Emp_id;
    String Emp_name;

    EmpCopyConst(int i,String name){
        Emp_id=i;
        Emp_name=name;
    }

    EmpCopyConst(EmpCopyConst s2){
        Emp_id=s2.Emp_id;
        Emp_name=s2.Emp_name;
    }

    void printInfo(){
        System.out.println("Details of employee " + Emp_id+" "+Emp_name);
    }

    public static void main(String[] args){
        EmpCopyConst emp=new EmpCopyConst(197, "Tanya");
        emp.printInfo();

        //Assigning value of emp to copy (making copy to point in same direct as emp)
        // EmpCopyConst copy;
        // copy=emp;

        // copy.Emp_id=51;
        // copy.Emp_name="Tanya yadav";
        // copy.printInfo();
        // emp.printInfo();

        //coping using constructor
        EmpCopyConst copy=new EmpCopyConst(emp);
        copy.Emp_id=51;
        copy.printInfo();
        emp.printInfo();
    }
}
//inheritence of parent class to child class
// | **Modifier**  | **Same Class** | **Same Package (non-subclass)** | **Subclass (in same package)** | **Subclass (in different package)**  | **Other Package (non-subclass)** |
// | ------------- | -------------- | ------------------------------- | ------------------------------ | ------------------------------------ | -------------------------------- |
// | **public**    | ✅ Yes          | ✅ Yes                           | ✅ Yes                          | ✅ Yes                                | ✅ Yes                            |
// | **protected** | ✅ Yes          | ✅ Yes                           | ✅ Yes                          | ✅ Yes (but only through inheritance) | ❌ No                             |
// | **default**   | ✅ Yes          | ✅ Yes                           | ✅ Yes                          | ❌ No                                 | ❌ No                             |
// | **private**   | ✅ Yes          | ❌ No                            | ❌ No                           | ❌ No                                 | ❌ No                             |

