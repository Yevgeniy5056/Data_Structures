package review;

public class UserLinkCreationTest {

    public static void main(String[] args) {

        User user1 = new User(1, "Austin");
        User user2 = new User(2, "Jason");
        User user3 = new User(3, "Carol");
        User user4 = new User(4, "Jack");

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
