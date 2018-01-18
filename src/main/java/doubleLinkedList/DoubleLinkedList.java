package doubleLinkedList;


public class DoubleLinkedList {

    /**
     * Nie potrzebujemy gettera ani settera, ponieważ nie chcemy
     * aby klient programista wiedział w jaki sposób
     * obsługujemy naszą listę.
     */
    private DoubleNode head;

    /**
     * Nie potrzebujemy gettera ani settera, ponieważ nie chcemy
     * aby klient programista wiedział w jaki sposób
     * obsługujemy naszą listę.
     */
    private DoubleNode tail;

    /**
     * Nie potrzebujemy gettera ani settera, ponieważ nie chcemy
     * aby klient programista wiedział w jaki sposób
     * obsługujemy naszą listę.
     */
    private int size = 0;

    /**
     * Metoda dodaje do listy kolejną wartość
     *
     * @param value wartość, kótra ma zostać dodana
     */
    public void add(Integer value) {
        DoubleNode node = new DoubleNode(value);
        //sprawdzam, czy w naszej liście już coś jest
        if (head == null) {
            //jeżeli lista jest pusta, to dodajemy pierwszy element.
            head = node;
        }
        //Analogicznie sprawdzamy, czy dodany element jest również ostatni.
        if (tail == null) {
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        //zwiększam ilość elementów w liście.
        size++;
    }

    public void addfirst(Integer value) {
        DoubleNode node = new DoubleNode(value);
        //sprawdzam, czy w naszej liście już coś jest
        if (head == null) {
            //jeżeli lista jest pusta, to dodajemy pierwszy element.
            head = node;
        }
        //Analogicznie sprawdzamy, czy dodany element jest również ostatni.
        if (tail == null) {
            tail = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head=node;
        }
        //zwiększam ilość elementów w liście.
        size++;
    }

    /**
     * Metoda usuwa podany w parametrze element.
     * @param element Node, który chcemy usunąć
     */
    public void remove(DoubleNode element) {

        if (element==null){
            return;
        }
        DoubleNode next = head.getNext();
        DoubleNode current = head;
        DoubleNode prev = null;

        while (current != null) {
            if (current == element) {
                //jeżeli head jest tym elementem, to trzeba go przesunąć
                if (head == current) {
                    head = next;
                    head.setPrev(null);
                    size--;
                    return;
                }
                prev.setNext(next);
                next.setPrev(prev);
                size--;
                return;
            } else {
                prev = current;
                current = current.getNext();
                next = current.getNext();
            }
        }
    }

    /**
     * zwraca ilość elementów w liście.
     *
     * @return
     */
    public int size() {
        return size;
    }

    public DoubleNode getFirst() {
        return head;
    }

    /**
     * Pobiera element z indeksem podanym w parametrze
     *
     * @param i
     * @return
     */
    public DoubleNode getElementAt(int i) {
        int index = 0;
        if (i>size()-1){
            System.out.println("Nie ma takiego elementu");
            return null;
        }
        DoubleNode current = head;
        while (index <= i) {
            if (index == i) {
                return current;
            }
            index++;
            if(current.getNext()!=null) {
                current = current.getNext();
            }
        }
        return null;
    }

    /**
     * Zwraca listę z odwrotną kolejnością.
     * @return odwrócona lista.
     */
    public DoubleLinkedList reverse(){
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(this.getElementAt(this.size()-1).getValue());
        doubleLinkedList.head.setPrev(null);
        doubleLinkedList.head.setNext(this.tail.getPrev());
        DoubleNode prev=null;
        DoubleNode current=doubleLinkedList.head;
        DoubleNode next;
        for (int i = this.size-2; i>=0 ;i--) {
            prev=current;
            current=current.getNext();
            current.setNext(current.getPrev());
            current.setPrev(prev);
            next = current.getNext();
        }
        doubleLinkedList.tail=current;
        return doubleLinkedList;
    }
}