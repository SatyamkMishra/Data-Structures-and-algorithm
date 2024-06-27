class Circular_queue_implementation{

    static class Queue{
        static int a[];
        static int size;
        static int front;
        static int rear;

        Queue(int n){
            a = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){

            if(isFull()){
               System.out.println("Queue is alreay full"); 
            }

            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            a[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is already empty");
                return -1;
            }

            int result = a[front];
            

            if(rear==front){
                rear = front = -1;
            }
            else{
                front = (front+1)%size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is already empty");
                return -1;
            }

            return a[front];
        }

    }

    public static void main(String[] args){

        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}