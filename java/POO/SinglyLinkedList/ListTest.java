public class ListTest {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();
        sll.add(99);
        sll.add(0);
        sll.printValues();

        System.out.println(sll.findByIndex(3));
        System.out.println(sll.findByIndex(5));
        System.out.println(sll.findByIndex(0));
        
        Node node1 = sll.find(99);
        System.out.println(node1.data);
        System.out.println(node1.next.data);

        sll.printValues();
        sll.removeAt(0);
        sll.printValues();
        sll.removeAt(4);
        sll.printValues();
        sll.removeAt(2);
        sll.printValues();
        
    }
}
