public class scope {

    String name;
    float salary;
    scope(String n, float s) {
        name = n;
        salary = s;
    }
    
    //Scope Matters: Local Objects Die After Method Ends
    //Objects declared inside a method can’t be accessed outside it.

    //To make an object accessible everywhere in the class:
    scope emp;  // instance variable

    void createObject() {
        emp = new scope("Global", 40000f);
    }

    void anotherMethod() {
        //emp.display();  ✅ Works here
    }

}
