import java.util.*;
public class Insert_in_Heap {

    static class Heap{
        ArrayList<Integer> a new ArrayList<>();
        public void add(int data){
            a.add(data);

            int child = a.size()-1;
            int parent = (child - 1)/2;

            while(a.get(child)< a.get(parent)){
                int temp = a.get(child);
                a.set(child, a.get(parent));
                a.set(parent,temp);
            }
        }
        public int peek(){
            return a.get(0);
        }
    }
    public static void main(String[] args){

    }
}
