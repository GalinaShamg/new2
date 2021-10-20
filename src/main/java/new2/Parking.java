package new2;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    public int cars;
 public int bigCapacity; //емкость парковки с большими местами
 public int smallCapacity; //емкость парковки с маленькими местами

    ArrayList<List<Integer>> parking = new ArrayList<List<Integer>>();//парковка хранит машины в виде чисел обозначающих машину
    List<Integer> bigSpaces = new ArrayList<Integer>(bigCapacity); //внутри парковки отдел для больших машин
    List<Integer> smallSpaces = new ArrayList<Integer>(smallCapacity); //внутри паркови отдел для маленьких машин

    public int b = bigSpaces.size(); //количество занятых мест у больших машин
    public int a =smallSpaces.size(); //количество занятых мест у маленьких машин

    public ArrayList<List<Integer>> CarsGoTo(int cars) {
        if (cars % 2 == 0 | cars == 0) {
            CheckSmallParking(); //метод, проверяющий наличие мест у маленьких машин
        } else {
            if ( b==0){
                bigSpaces.add(cars);
                parking.add(bigSpaces);
                System.out.print ("Машина заняла 1 большое место");
            }
            else if ( b % bigCapacity >0){ //если места на большой парковке еще есть
                bigSpaces.add(cars);
                parking.add(bigSpaces);
            }
            else{
                MaybeToSmallParking(); //если мест для больших нет, смотрим у маленьких
                }

            }

         return parking;
    }

            public ArrayList<List<Integer>> CarsGoAway (int cars){
                boolean existsSmall = smallSpaces.size() > cars; // чтобы не было IndexofBound Exception
                boolean existsBig = bigSpaces.size() > cars;// чтобы не было IndexofBound Exception
                String carstring = Integer.toString(cars);

                   if (cars % 2 == 0 | cars == 0) { //если машина маленькая, удаляем из мест для маленьких

                           smallSpaces.remove(carstring);
                           parking.remove(smallSpaces);

                    } else{
                          bigSpaces.remove(carstring); //если машина большая удаляем из больших
                          parking.remove(bigSpaces);

                   }
                    System.out.print("Машина уехала");

                return parking;
            }

            private void CheckSmallParking(){
                 if ( a==0){
                      smallSpaces.add(cars);
                      parking.add(smallSpaces);
                     System.out.print("Заняла маленькое место");
                  }
                     else if (a % smallCapacity >0){
                        smallSpaces.add(cars);
                        parking.add(smallSpaces);
                     }
                else {
                    System.out.println("Мест нет");
                }
            }

            private void MaybeToSmallParking(){
               if ( a==0){
                   smallSpaces.add(cars);
                   parking.add(smallSpaces);
                   smallSpaces.add(cars);
                   parking.add(smallSpaces);
                   System.out.print("Большая машина заняла 2 маленьких места");
               }
               else if (a % smallCapacity >0){
                   smallSpaces.add(cars);
                   parking.add(smallSpaces);
                   smallSpaces.add(cars);
                   parking.add(smallSpaces);
               }
               else{
                    System.out.println("Мест нет");
                }}

            }




