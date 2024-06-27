public class Copy_constructor {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Satyam";
        s1.age = 23;
        Student s2 = new Student(s1);
    }
}
class Student{
    String name;
    int age;

    Student(){
        this.name = name;
        this.age = age;
    }

    Student(Student ref){
        this.name = ref.name;
        this.age = ref.age;
        System.out.println(name + " " + age);
    }
}