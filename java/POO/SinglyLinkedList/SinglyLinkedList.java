public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
        runner.next = newNode;
        }
    }

    public void remove() {
        if(head == null) {
            return;
        } else if(head.next == null) {
            head = null;
            return;
        }
        Node runner = head;
        while(runner.next.next != null) {
            runner = runner.next;
        }
        runner.next = null;
    }

    public void removeAt(int index) {
        if(index == 0) {
            head = head.next;
            return;
        }

        Node runner = head;
        for(int i = 0; i < index - 1; i++) runner = runner.next;
        runner.next = runner.next.next;
    }

    public Node find(int data) {
        Node runner = head;
        while(runner.next != null) {
            if(runner.data == data) {
                return runner;
            }
            runner = runner.next;
        }
        return null;
    }    

    public int findByIndex(int index) {
        Node runner = head;
        for(int i = 0; i < index; i++) {
            runner = runner.next;
        }
        return runner.data;
    }
    
    public void printValues() {
        Node runner = head;
        String values = "";
        while(runner != null) {
            if(runner.next == null) values += runner.data;
            else values += runner.data + "->";
            runner = runner.next;
        }
        System.out.println(values);
    }
   
}