package singlyLinkedList;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(1);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        singlyLinkedList.add(6);

//        Node toRemove = singlyLinkedList.getElementAt(1);

//        singlyLinkedList.remove(toRemove);

//        printNodes(singlyLinkedList.getFirst());


        Iterator<Integer> iterator = singlyLinkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static void printNodes(Node node) {
        Node current = node;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }

    }
}