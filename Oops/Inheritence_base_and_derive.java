class Inheritence_base_and_derived{
    public static void main(String[] agrs){
        Fish f1 = new Fish();
        f1.eat();
    }
}
//Single level inheritence
class Animal{
    String name;
    

    void eat(){
        System.out.println("Eats");
    }
    void sleep(){
        System.out.println("Sleeps");
    }
}

class Fish extends Animal{

    void swim(){
        System.out.println("Swim");
    }
}