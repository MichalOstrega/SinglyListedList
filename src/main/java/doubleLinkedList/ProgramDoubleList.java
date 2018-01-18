package doubleLinkedList;



import java.util.Scanner;

public class ProgramDoubleList {
    DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    public ProgramDoubleList() {
        this.run();
    }


    private void run() {
        Integer choose=0;

        while (!exit) {
            System.out.println("Menu programu: \n" +
                    "1. Dodaj element na początek listy \n" +
                    "2. Wyświetl wszystkie elementy listy \n" +
                    "3. Dodaj element na koniec listy \n" +
                    "4. Usuń wybrany element listy \n" +
                    "5. Wyjście z programu");
            try {

                choose = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                break;
            }
            switch (choose) {
                case 1: {
                    System.out.print("Podaj wartość elementu: ");

                    addfirst(Integer.parseInt(scanner.nextLine()));
                    break;
                }
                case 2: {
                    printNodes(doubleLinkedList);
                    break;
                }
                case 3: {
                    System.out.print("Podaj wartość elementu: ");
                    add(Integer.parseInt(scanner.nextLine()));
                    break;
                }
                case 4: {
                    System.out.print("Podaj element do usunięcia: ");
                    remove(Integer.parseInt(scanner.nextLine()));
                    break;
                }
                case 5: {
                    exit=true;
                    break;
                }
                default: {

                }
            }

        }
        System.out.println("Bye Bye");
    }

    private void remove(Integer integer) {
        doubleLinkedList.remove(doubleLinkedList.getElementAt(integer));
    }

    private void add(Integer value) {
        doubleLinkedList.add(value);
    }

    private void printNodes(DoubleLinkedList list) {
        DoubleNode tmpNode = doubleLinkedList.getFirst();
        int n = 0;
        while (tmpNode != null) {

            System.out.println(n++ + ". : " + tmpNode.getValue());
            tmpNode = tmpNode.getNext();
        }
    }

    private void addfirst(Integer value) {
        doubleLinkedList.addfirst(value);
    }


}

