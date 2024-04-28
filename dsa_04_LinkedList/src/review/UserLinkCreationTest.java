package review;

public class UserLinkCreationTest {

    public static void main(String[] args) {

        User user1 = new User("Anton", "Austin");
        User user2 = new User("Dima", "Jason");
        User user3 = new User("Sasha", "Carol");
        User user4 = new User("Ura", "Jack");

        user1.next = user2;
        user2.next = user3;
        user3.next = user4;

        User curr = user1;
        while (curr != null) {
            System.out.println(curr.name);
            curr = curr.next;
        }
    }
}
