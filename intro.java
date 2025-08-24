import java.util.*;


public class intro {
    String name;
    float salary;

    public void getDetails(){
    System.out.println("Details: "+name + salary);
}
    //function dec
    // public static void print(String name){
    //     System.out.println(name);
    // }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //basic input and output
        // System.out.println("hello");
        // int n=2;
        // System.out.println(n+"hello"+(3*4));
       
        // String name =sc.next(); 
        // int age=sc.nextInt();
        // String fullname=sc.nextLine();
        // //cant use next line instantly after nextInt
        // double price =sc.nextFloat();
        // char a=sc.next().charAt(0);
        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(price);
        // System.out.println(fullname);

        //FUNCTION call
        // print("Tanya");

        //Math.pow(2,3);

        intro emp=new intro();

        emp.name=sc.next();
        emp.salary=sc.nextFloat();
        emp.getDetails();


    }
}
