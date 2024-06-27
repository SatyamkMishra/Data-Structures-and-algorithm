class Method_overriding_run_time_polymorphism {
    //When PArent and Child class contain Same Function with different difinitions
    public static void main(String[] args){
        Deer d1 = new Deer();
        d1.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eat anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats only grass");
    }
}