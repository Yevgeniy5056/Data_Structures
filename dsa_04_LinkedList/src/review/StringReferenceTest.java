package review;

public class StringReferenceTest {

    public static void main(String[] args) {

        Car car1 = new Car("Audi", 2020);
        Car car2 = new Car("BMW", 2024);
        Car car3 = new Car("Ford", 2022);

        car1.next = car2;
        car2.next = car3;

        System.out.println(car1);
        System.out.println(car1.next);

        Car curr = car1;
        while (curr != null) {
            System.out.println(curr.make + " address of this object is " + curr);
            curr = curr.next;
        }
    }
}
