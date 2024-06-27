class Stack_Implementation_using_ArrayList{

    public class Stack{
        static ArrayList<Integer> a = new ArrayList<>();

        public static boolean isEmpty(){
            return a.size()==0;
        }

        public static void push(int data){
            a.add(data);
        }

        public static int pop(){
            int top = a.get(a.size()-1);
            a.remove(a.size()-1);
            return top;
        }

        public static int peek(){
            return a.get(a.size()-1);
        }

        public void print(){
            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
        }

    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        s.print();
    }
}