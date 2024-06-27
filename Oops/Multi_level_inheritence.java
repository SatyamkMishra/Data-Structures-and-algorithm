class Multi_level_inheritence {
    public static void main(String[] args){
        Leopard l1 = new Leopard();
        l1.sleep();
    }
}

class Cat{
    String color;
    int weight;

    void run(){
        System.out.println("Cat can runs very fastly");
    }

    void sleep(){
        System.out.println("Cat also can sleep");
    }
}

class Lion extends Cat{

    void hunt(){
        System.out.println("Tiger never forgets to hunt");
    }
}

class Leopard extends Lion{

    void rest(){
        System.out.println("Leopard rest most of the times");
    }
}