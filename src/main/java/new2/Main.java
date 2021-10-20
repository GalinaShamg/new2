package new2;

import org.apache.log4j.xml.DOMConfigurator;

import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Main {


    public static void main(String[] args) {

        Cars cars = new Cars(); //создали машину
        cars.BigOrSmall();  //определили размер машины

        Parking parking = new Parking(); //создали парковку
        parking.CarsGoTo(cars.cars); //машина въезжает
        parking.CarsGoAway(cars.cars); //машина выезжает

    }

}