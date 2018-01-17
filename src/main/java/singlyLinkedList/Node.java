package singlyLinkedList;

public class Node {
    private Node next;
    /**
     * Zakładamy, że nasze nody, mogą przechowywawć tylko
     * wartości liczbowe
     */
    private Integer value;

    public Node(Integer value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public Node setNext(Node next) {
        this.next = next;
        return this;
    }

    public Integer getValue() {
        return value;
    }

    public Node setValue(Integer value) {
        this.value = value;
        return this;
    }
}