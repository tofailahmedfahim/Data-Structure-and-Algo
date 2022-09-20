import java.util.EmptyStackException;

class Node {
    public String data;
    public Node next;


    public Node(String data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    public Node head;
    public Node top;
    private int length;

    public Stack() {
        length = 0;
        head = null;
        top = null;
    }

    public void display() {
        Node temp = this.head; //temporary pointer to point to head

        while(temp != null) { //iterating over stack
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }

        System.out.println("");
    }

    public boolean isEmpty() {
        if(this.top == null)
            return true;
        return false;
    }

    public void push(Node n) {
        if(this.isEmpty()) {
            this.head = n;
            this.top = n;
            length++;
        }
        else {
            this.top.next = n;
            this.top = n;
            length++;
        }
    }
    public String peek() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();

        return top.data;
    }

    public String pop() {
        if(this.isEmpty()) {
            System.out.println("Stack Underflow\n");
            return String.valueOf(-1000);
        }
        else {
            String x = this.top.data;
            if(this.head == this.top) {// only one node
                this.top = null;
                this.head = null;
                length--;
            }
            else {
                Node temp = this.head;
                while(temp.next != this.top) // iterating to the last element
                    temp = temp.next;
                temp.next = null;
                this.top = temp;
                length--;
            }
            return x;
        }
    }


    // Returns the number of elements in the stack.
    public int size() {
        return length;
    }
}

class StackMain {
    public static void main(String[] args) {
        Stack s = new Stack();
//        Liam, Noah, Ames, Oliver, Benjamin, Lucas, Mason, Jacob,
//                Michael, Daniel, Jackson, Aiden, Matthew.

        Node a, b, c,d,e,f,g,h,i,j,k,l,m;
        a = new Node("Liam");
        b = new Node("Noah");
        c = new Node("Ames");
        d = new Node("Oliver");
        e = new Node("Benjamin");
        f = new Node("Lucas");
        g = new Node("Mason");
        h = new Node("Jacob");
        i = new Node("Michael");
        j = new Node("Daniel");
        k = new Node("Jackson");
        l = new Node("Aiden");
        m = new Node("Matthew");


        s.pop();
        s.push(a);
        s.push(b);
        s.push(c);
        s.push(d);
        s.push(e);
        s.push(f);
        s.push(g);
        s.push(h);
        s.push(i);
        s.push(j);
        s.push(k);
        s.push(l);
        s.push(m);

        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        s.display();
        s.pop();
        s.display();


    }
}