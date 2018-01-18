package genericList;

public class GenericListTest {
    public static void main(String[] args) {
        GenericSinglyLinkedList<String> genericSinglyLinkedList = new GenericSinglyLinkedList<>();
        genericSinglyLinkedList.add("5");
        genericSinglyLinkedList.add("3");
        genericSinglyLinkedList.addfirst("12");
        System.out.println(genericSinglyLinkedList.getFirst().getValue());
    }
}
