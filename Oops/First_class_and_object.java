public class First_class_and_object {

    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("Green");
        System.out.println(p1.color);
        p1.setTip(12);
        System.out.println(p1.tip);


        Student s1 = new Student();
        s1.findPercentage(56,56 ,56 );
        System.out.println(s1.percentage);
        s1.setName("Manish");
        System.out.println(s1.name);

        //for second student
        Student s2 = new Student();
        s2.findPercentage(76,58 ,55 );
        System.out.println(s2.percentage);
        s2.setName("anish");
        System.out.println(s2.name);
    }
    

}
class Pen{
    //Properties + Function
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

}

class Student{
    int percentage;
    String name;

    void findPercentage(int phy,int chem,int math){
        percentage=(phy+chem+math)/3;
    }

    void setName(String newName){
        name = newName;
    }


}