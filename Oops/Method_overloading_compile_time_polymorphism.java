class Method_overloading_compile_time_polymorphism{
    //when multiple with same name but with differnt parameter
    
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(1,2));
        System.out.println(c1.sum(1.0,2.0));
        System.out.println(c1.sum(1,2,3));

    }
}
class Calculator{

    int sum(int a,int b){
        return a+b;
    }

    double sum(double a, double b){
        return a+b;
    }

    int sum(int a,int b, int c){
        return a+b+c;
    }
}