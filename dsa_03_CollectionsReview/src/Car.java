public class Car {

    int id;
    String make;

    public Car(int id, String make) {
        this.id = id;
        this.make = make;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Car car = (Car) object;

        if (id != car.id) return false;
        return make.equals(car.make);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + make.hashCode();
        return result;
    }
}
