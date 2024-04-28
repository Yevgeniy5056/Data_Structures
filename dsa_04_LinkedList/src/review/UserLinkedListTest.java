package review;

public class UserLinkedListTest {

    public static void main(String[] args) {

        UserLinkedList list = new UserLinkedList();

        list.printNames();

        list.insertInTheEnd(new User("Jason", "Born"));
        list.insertInTheEnd(new User("John", "Doe"));
        list.insertInTheEnd(new User("Carol", "Walsh"));

        list.printNames();

        System.out.println();
        System.out.println(list.getName(2));

        list.deleteByName("Carol");
        list.printNames();

    }
}
