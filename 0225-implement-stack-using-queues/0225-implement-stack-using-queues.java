import java.util.*;

class MyStack {

Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {

        q2.offer(x);

        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

//     Queue<Integer> q;

//     public MyStack() {
//         q = new LinkedList<>();
//     }

//     public void push(int x) {

//         q.offer(x);

//         int size = q.size();

//         while (size > 1) {
//             q.offer(q.poll());
//             size--;
//         }
//     }

//     public int pop() {
//         return q.poll();
//     }

//     public int top() {
//         return q.peek();
//     }

//     public boolean empty() {
//         return q.isEmpty();
//     }
// }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */