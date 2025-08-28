//abstract method ka sirf abstract class hi hogi
abstract class college{
    abstract void Register();
    abstract void infrastructure();
    abstract void Students();
    abstract void staff();

    void medicalFacility(){
        System.out.println("Medical facilities are optional");
    }
}
//The type college.KIET must implement the inherited abstract methods of college

 //if we dont want to use above abstact method then make KIET class also an abstract class
class KIET extends college{
    void Register(){
        System.out.println("regis");
    }
    void infrastructure(){
        System.out.println("infra");
    }
    void Students(){
        System.out.println("stu");
    }
    void staff(){
        System.out.println("staff");
    }
    //medical faci is not mandatory as not an abstract class
    void medicalFacility(){
        System.out.println("MF");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        college cg; //college ek abstract class k refrence var is c
        cg=new KIET();
        cg.Register(); 
        cg.infrastructure();
        cg.Students();
        cg.staff();
        cg.medicalFacility();
    }
}
