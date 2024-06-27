public class Copy_2_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Satyam";
        s1.age = 12;
        s1.pass = "ssss";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        Student s2 = new Student(s1);
        s2.pass = "ysss";
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.pass);
        s1.marks[1] = 100;
        System.out.println(s2.marks[0]);
        System.out.println(s2.marks[1]);
        System.out.println(s2.marks[2]);

    }
}

class Student {
    String name;
    int age;
    String pass;
    int marks[] = new int[3];
//Shallow Constructor
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
        this.marks = s1.marks;
    }
// deep copy
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     for(int i=0;i<marks.length;i++){
    //         this.marks[i] = s1.marks[i];
    //     }
    // }

    Student() {
        System.out.println("Hello hi how are you.....");
    }

    Student(String name) {
        this.name = name;
        marks=new int[3];

    }

    Student(int age) {
        this.age = age;
        marks=new int[3];

    }
}
