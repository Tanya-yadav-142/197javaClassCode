//interface k andr methods by default abstarct hote h

interface institute{
    //by default these methods are abstract and public
    void Register();
    void infrastructure();
    void Students();
    void staff();

    static void st(){
        System.out.println("Concrete");
    }
    default void defConcrete(){
        System.out.println("default concrete");
    }
    private void prcon (){
        System.out.println("Private concrete");
    }
}

//in place of extends we use implements in case of interface parent
class IIT implements institute{
    //intitute se ye nahi le rha as in institute class these method are public and here became  default 
    //thus public krna padega
    public void Register(){
        System.out.println("regis");
    }
    public void infrastructure(){
        System.out.println("infra");
    }
    public void Students(){
        System.out.println("stu");
    }
    public void staff(){
        System.out.println("staff");
    }
    
}


public class interfaceExample {
    public static void main(String[] args) {
        institute cg;
        cg=new IIT();
        cg.Register(); 
        cg.infrastructure();
        cg.Students();
        cg.staff();
        
        institute.st();
        cg.defConcrete();
        

    }
}
