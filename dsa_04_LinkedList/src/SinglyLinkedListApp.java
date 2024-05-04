public class SinglyLinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList myList = new MySinglyLinkedList();

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        myList.printNodes();
        System.out.println("Kth item from the last" + myList.getKthItemFromLast(3));
        myList.printNodes();
        myList.removeKthItemFromLast(3);
        myList.printNodes();
    }
}
