package genericList;

public class GenericSinglyLinkedList <T> {

    /**
     * Nie potrzebujemy gettera ani settera, ponieważ nie chcemy
     * aby klient programista wiedział w jaki sposób
     * obsługujemy naszą listę.
     */
    private GenericNode<T> head;

    /**
     * Nie potrzebujemy gettera ani settera, ponieważ nie chcemy
     * aby klient programista wiedział w jaki sposób
     * obsługujemy naszą listę.
     */
    private GenericNode<T> tail;

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
    public  void add(T value) {
        GenericNode<T> node = new GenericNode<T>(value);
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
            tail = node;
        }
        //zwiększam ilość elementów w liście.
        size++;
    }

    public void addfirst(T value) {
        GenericNode<T> node = new GenericNode<T>(value);
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
            head=node;
        }
        //zwiększam ilość elementów w liście.
        size++;
    }

    /**
     * Metoda usuwa podany w parametrze element.
     * @param element Node, który chcemy usunąć
     */
    public void remove(GenericNode<T> element) {

        if (element==null){
            return;
        }
        GenericNode<T> current = head;
        GenericNode<T> prev = null;

        while (current != null) {
            if (current == element) {
                //jeżeli head jest tym elementem, to trzeba go przesunąć
                if (head == current) {
                    head = current.getNext();
                    size--;
                    return;
                }
                prev.setNext(current.getNext());
                size--;
                return;
            } else {
                prev = current;
                current = current.getNext();
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

    public GenericNode<T> getFirst() {
        return head;
    }

    /**
     * Pobiera element z indeksem podanym w parametrze
     *
     * @param i
     * @return
     */
    public GenericNode<T> getElementAt(int i) {
        int index = 0;
        if (i>size()-1){
            System.out.println("Nie ma takiego elementu");
            return null;
        }
        GenericNode<T> current = head;
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
    public GenericSinglyLinkedList<T> reverse(){
        GenericSinglyLinkedList<T> genericSinglyLinkedList = new GenericSinglyLinkedList<T>();
        for (int i = this.size-1; i>=0 ;i--) {
            genericSinglyLinkedList.add(getElementAt(i).getValue());
        }
        return genericSinglyLinkedList;
    }
}