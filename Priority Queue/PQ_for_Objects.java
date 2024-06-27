import  java.util.*;
public class PQ_for_Objects {

    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s1){
            return this.rank - s1.rank;
    }
}
    public static void main(String[] args){

        PriorityQueue<Student> p = new PriorityQueue<>();
        p.add(new Student("A", 5));
        p.add(new Student("B", 3));
        p.add(new Student("C", 4));
        p.add(new Student("D", 1));
        while(!p.isEmpty()){
            System.out.println(p.peek().name + " " + p.peek().rank);
            p.remove();
        }
    }
}
