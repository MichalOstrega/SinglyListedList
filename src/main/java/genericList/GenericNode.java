package genericList;

public class GenericNode <T> {
    private GenericNode<T> next;
    /**
     * Zakładamy, że nasze nody, mogą przechowywawć tylko
     * wartości liczbowe
     */
    private T value;

    public  GenericNode(T value) {
        this.value = value;
    }

    public GenericNode <T> getNext() {
        return next;
    }

    public GenericNode <T> setNext(GenericNode<T> next) {
        this.next = next;
        return this;
    }

    public T getValue() {
        return value;
    }

    public GenericNode <T> setValue(T value) {
        this.value = value;
        return this;
    }
}