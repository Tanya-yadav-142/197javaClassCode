public class Employeestatic {
    int Emp_id;
    // String Org;
    static String Org;

    //static block is another way to initialise static variable all at one place i.e, inside the block

    void Details(){
        System.out.println("ID: "+Emp_id+" "+"organisation: "+Org);
    }

    public static void main(String[] args){

        Employeestatic.Org="Kiet";
        Employeestatic es=new Employeestatic();
        es.Emp_id=101;
        // es.Org="KIET";
        es.Details();

        Employeestatic es2=new Employeestatic();
        es2.Emp_id=101;
        // es2.Org="KIET";
        es2.Details();


    }
}
