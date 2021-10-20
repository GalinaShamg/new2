package new2;


import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main {


    public static void main(String[] args) throws Exception {

        Cars cars = new Cars(); //создали машину

        Parking parking = new Parking(); //создали парковку
        parking.CarsGoTo(cars.cars); //машина въезжает
        parking.CarsGoAway(cars.cars); //машина выезжает

    }

}