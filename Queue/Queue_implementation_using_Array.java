class Queue_implementation_using_Array{

    static class Queue{
        static int a[];
        static int size;
        static int rear;

        Queue(int n){
            a = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is already full");
                return;
            }
            rear = rear + 1;
            a[rear] = data;

        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is already full");
                return -1;
            }

            int front = a[0];
            for(int i=0;i<rear;i++){
                a[i] = a[i+1];
            }
            rear = rear - 1;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is already full");
                return -1;
            }
            return a[0];
        }
    }
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}