import java.util.ArrayList;
import java.util.Arrays;

public class NumOfPeopleInTheBusSolution {
    public static void main(String[] args) {

        var busStops = new ArrayList<>(Arrays.asList(
                new int[]{10, 0},
                new int[]{3, 5},
                new int[]{2, 5}
        ));
        System.out.println(countPassengers(busStops));
    }

    public static int countPassengers(ArrayList<int[]> stops) {

        var numOfPeople = 0;

        for (var stop : stops) {
            numOfPeople = numOfPeople + stop[0] - stop[1];
        }
        return numOfPeople;
    }
}