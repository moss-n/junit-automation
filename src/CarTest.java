import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class CarTest {

    String make = "Honda"; 
    String model = "Civic"; 
    String[] makeArr = {make,"wrong-make"}; 
    Car testCar = new Car(make, model); 
    Random rand = new Random(); 
    int limit = 2;
    int randomInt = rand.nextInt(limit);
    String randomActual = makeArr[randomInt];  

    @Test
    public void testMake(){
        System.out.println("Running Test 1!");
        Assertions.assertEquals(make, randomActual,"Expected vehicle make did not match actual vehicle make"); 
    }

    @Test 
    public void testModel(){
        System.out.println("Running Test 2!");
        Assertions.assertEquals(model,testCar.getModel(),"Expected vehicle model did not match actual vehicle model"); 
    }
    
}

