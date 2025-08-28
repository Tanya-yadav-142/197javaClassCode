public class Basics {
    String name;
    float salary;

    // Constructor initializes an object when it’s created.
    Basics(String n, float s) {
        name = n;
        salary = s;
    }
    Basics(){

        }
    //A method defines what an object does (its behavior).
    int add(int a, int b) { 
        return a + b;
    }

    void display() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Basics emp = new Basics("Tanya", 50000.5f);//object ki declaration
        emp.display();


        Basics calc = new Basics();
        System.out.println("Sum: " + calc.add(5, 10));

        


    }
}

