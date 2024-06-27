class Abstract_constructor_calling{

    public static void main(String[] args) {
        Lion l1 = new Lion();
        
        
    }
}

abstract class Animal{
    
    Animal(){
        System.out.println("Animal constructor is called");
    }
    
    void sleep(){
        System.out.println("All animal sleepin the night");
    }
    
    abstract void eat();
}


class Deer extends Animal{
    
    Deer(){
        System.out.println("Deer constructor is called");
    }
    
    void eat(){
        System.out.println("Deer eats grass");
    }
}

class Lion extends Deer{
    
    Lion(){
        System.out.println("Lion constructor is called");
    }
    
    void eat(){
        System.out.println("Lion eats other animal");
    }
}