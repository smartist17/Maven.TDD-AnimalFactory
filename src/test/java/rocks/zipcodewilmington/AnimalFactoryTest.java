package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import javax.naming.Name;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test

    public void createDogTest() {
        //Given
        AnimalFactory animalFactory = new AnimalFactory();
        String name = "Doggie";
        Date birthDate = new Date(122517);

        //When
        Dog newDog = animalFactory.createDog(name, birthDate);
        boolean isDog = newDog instanceof Dog;

        //Then
        Assert.assertEquals("Running Tests", true, isDog);
        Assert.assertEquals(name, newDog.getName());
        Assert.assertEquals(birthDate, newDog.getBirthDate());
    }
    @Test

    public void createDogCat() {
        //Given
        AnimalFactory animalFactory = new AnimalFactory();
        String name = "Kitty";
        Date birthDate = new Date(010120);

        //When
        Cat newCat = animalFactory.createCat(name, birthDate);
        boolean isCat = newCat instanceof Cat;

        //Then
        Assert.assertEquals("Running Tests", true, isCat);
        Assert.assertEquals(name, newCat.getName());
        Assert.assertEquals(birthDate, newCat.getBirthDate());
    }
}
