import org.junit.Assert;
import org.junit.Test;

/**
 * I have a dog
 my dog is an animal
 my dog makes a sound
 the sound is "bark"
 My dog is white
 */
public class DogTest {
    @Test
    public void dogTest(){
        Dog dog = new Dog();
        Animal animal = new Animal();
        Animal dog2 = new Dog();

        String sound = animal.makeSound();
        String color = animal.color();

        Assert.assertTrue(sound.equalsIgnoreCase("sound"));
        Assert.assertTrue(color.equalsIgnoreCase("color"));

        Assert.assertTrue(dog.makeSound().equalsIgnoreCase("Bark"));
        Assert.assertTrue(dog.color().equalsIgnoreCase("white"));

    }
}
