package doubleLinkedList;

public class DoubleNode {
    private DoubleNode next;
    private DoubleNode prev;

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    /**
     * Zakładamy, że nasze nody, mogą przechowywawć tylko
     * wartości liczbowe
     */
    private Integer value;

    public DoubleNode(Integer value) {
        this.value = value;
    }

    public DoubleNode getNext() {
        return next;
    }

    public DoubleNode setNext(DoubleNode next) {
        this.next = next;
        return this;
    }

    public Integer getValue() {
        return value;
    }

    public DoubleNode setValue(Integer value) {
        this.value = value;
        return this;
    }
}