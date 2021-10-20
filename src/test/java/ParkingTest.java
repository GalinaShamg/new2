import new2.Parking;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ParkingTest {

    private Parking parking;
    private List<Integer> smallSpaces;

    @BeforeClass
public static void beforeClass(){
    System.out.println("Before ParkingTest.class");
}

@AfterClass
public static void afterClass(){
    System.out.println("After ParkingTest.class");
}

protected  ByteArrayOutputStream output;
    private PrintStream old;

    @Before
    public void setUpStreams() {
        old = System.out;
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(old);
    }


    @Test
    public void testBigCar() throws Exception {
        int cars=7;
        Parking parking = new Parking();
        ArrayList<List<Integer>> lists = parking.CarsGoTo(7);
        String template = "Машина заняла 1 большое место";
        Assert.assertEquals(template, output.toString());
    }

    @Test
    public void testSmallCar() throws Exception {
        int cars=0;
        int a =1;
        int smallCapacity=1;
        Parking parking = new Parking();
        ArrayList<List<Integer>> lists = parking.CarsGoTo(0);
        String template = "Заняла маленькое место";
        Assert.assertEquals(template, output.toString());
    }

    @Test
    public void testGoAway() throws Exception {
        int cars=2;
       int b = 10; //количество занятых мест у больших машин
        int a =10;

        Parking parking = new Parking();
        List<Integer> bigSpaces = new ArrayList<Integer>(10); //внутри парковки отдел для больших машин
        List<Integer> smallSpaces = new ArrayList<Integer>(10);
        ArrayList<List<Integer>> lists = parking.CarsGoAway(2);
        String template = "Машина уехала";
        Assert.assertEquals(template, output.toString());
    }
  }


