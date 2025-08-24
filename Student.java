public class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with name
    Student(String n) {
        name = n;
        age = 0;
    }

    // Constructor with name and age
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Tanya");
        Student s3 = new Student("Tanya", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}

