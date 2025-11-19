import java.util.LinkedList;
import java.util.Queue;


class StackUsingTwoQueues {
   Queue<Integer> q1 = new LinkedList<>();
   Queue<Integer> q2 = new LinkedList<>();


   // Push element onto stack
   void push(int x) {
       q2.add(x);
       while (!q1.isEmpty()) {
           q2.add(q1.poll());
       }
       Queue<Integer> temp = q1;
       q1 = q2;
       q2 = temp;
   }


   // Pop element from stack
   int pop() {
       if (q1.isEmpty()) {
           System.out.println("Stack is Empty");
           return -1;
       }
       return q1.poll();
   }


   // Peek top element of stack
   int peek() {
       if (q1.isEmpty()) {
           System.out.println("Stack is Empty");
           return -1;
       }
       return q1.peek();
   }


   // Check if stack is empty
   boolean isEmpty() {
       return q1.isEmpty();
   }


   public static void main(String[] args) {
       StackUsingTwoQueues stack = new StackUsingTwoQueues();
       stack.push(10);
       stack.push(20);
       stack.push(30);


       System.out.println("Top element: " + stack.peek()); System.out.println("Popped: " + stack.pop());
       System.out.println("Top after pop: " + stack.peek());
       stack.push(40);
       System.out.println("Top after pushing 40: " + stack.peek());
   }
}
