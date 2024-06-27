class Hierarchial_inheritence{
    public static void main(String[] args){
        Tiger t1 = new Tiger();
        t1.eats();
    }
}

class Animal{
    String color;
    int weight;

    void sleep(){
        System.out.println("All the animals sleeps most of their times");
    }

    void eats(){
        System.out.println("All eats their favourite foods");
    }
}

class Fish extends Animal{

    void swim(){
        System.out.println("Fish swims in water");
    }
}

class Tiger extends Animal{

    void hunt(){
        System.out.println("Tiger never forgets to hunt");
    }
}