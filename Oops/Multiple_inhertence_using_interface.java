class Multiple_inhertence_using_interface {
    public static void main(String[] args) {
        Man m = new Man();
        m.move();
    }
}

interface Animal{
    void eat();
}

interface Mammal{
    void move();
}

class Man implements Animal,Mammal{
    public void eat(){
        System.out.println("Can eat");
    }
    
     public void move(){
        System.out.println("Can move");
    }
}