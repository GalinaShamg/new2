package new2;

import java.util.ArrayList;
import java.util.HashMap;

public class Parking {

    ArrayList < Integer > parking = new ArrayList < Integer > (); //парковка хранит машины в виде чисел обозначающих машину, правильно ли я слышала комментарий, что размер парковки не ограничиваем?

       public interface CarsGoTo {
            public void CarsGoTo();
        }

    public void CarsGoTo(int cars){

        parking.add(cars);
       System.out.println("Машина въехала на парковку");

       }

    public void CarsGoAway(int cars){

        parking.remove(cars);
        System.out.println("Машина уехала");

    }

    }


