import org.junit.Assert;
import org.junit.Test;

/**
 * Hawk story:

 Given: There is a Hawk
 And: Hawk is an Bird
 And: Hawk makes a sound
 My Hawk is brown
 Given: sound is “Cacaw”
 */
public class HawkTest {

    @Test
    public void hawkTest() {
        Hawk hawk = new Hawk();
        Bird bird = new Bird();
        Bird hawk2 = new Hawk();

        String sound = bird.makeSound();
        String color = bird.color();
        Assert.assertTrue(sound.equalsIgnoreCase("sound"));
        Assert.assertTrue(color.equalsIgnoreCase("color"));

        Assert.assertTrue(hawk.makeSound().equalsIgnoreCase("Ca-caw"));
        Assert.assertTrue(hawk.color().equalsIgnoreCase("Brown"));
    }
}
