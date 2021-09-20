package collectionDemo;
import java.util.*;
public class StackAndQueueDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(25);
        stack.push(26);
        stack.push(35);
        stack.push(46);
        stack.push(13);
        stack.push(18);
        stack.push(17);

        System.out.println(stack);
        System.out.println(stack.pop() +" "+ "Removed From stack");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

        System.out.println("*************************************************************************************************************");

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(25);
        queue.offer(17);
        queue.offer(13);
        queue.offer(21);
        queue.offer(54);

        System.out.println(queue);
        System.out.println(queue.poll() );
        System.out.println(queue.peek());
        System.out.println(queue.size());




    }
}
