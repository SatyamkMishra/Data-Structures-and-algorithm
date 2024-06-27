public class Default_constructor {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.display();
    }
}
class Student{
    String name;
    int age;
    boolean pass;
    Student(){
        age=12;
        name = "hello";
        pass = true;
        //System.out.println("hello");
    }
    void display(){
        System.out.println(name+ " " + age + " " + pass);
    }
}