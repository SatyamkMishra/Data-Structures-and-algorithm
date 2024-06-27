class Abstract_classes{
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.eat();
        l1.sleep();
       System.out.println(l1.color);
        
        Deer d1 = new Deer();
        d1.eat();
        d1.sleep();
         System.out.println(d1.color);
         d1.setColor();
         System.out.println(d1.color);
        
    }
}

abstract class Animal{
    String color;
    Animal(){
        color="red";
    }
    void sleep(){
        System.out.println("All animal sleepin the night");
    }
    
    abstract void eat();
}


class Deer extends Animal{
    
    void setColor(){
        color = "brown";
    }
    void eat(){
        System.out.println("Deer eats grass");
    }
}

class Lion extends Animal{
    
    void setColor(){
        color = "black";
    }
    void eat(){
        System.out.println("Lion eats other animal");
    }
}