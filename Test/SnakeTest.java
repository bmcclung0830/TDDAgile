import org.junit.Assert;
import org.junit.Test;

/**
 * I have a snake
 My snake is a reptile
 My snake can make a sound
 My snake is Green
 My snake says "sssssss"
 */
public class SnakeTest {
    @Test
    public void snakeTest(){
        Snake snake = new Snake();
        Reptile reptile = new Reptile();
        Reptile snake2 = new Snake();

        String sound = reptile.makeSound();
        String color = reptile.color();

        Assert.assertTrue(sound.equalsIgnoreCase("snake sound"));
        Assert.assertTrue(color.equalsIgnoreCase("color"));

        Assert.assertTrue(snake.makeSound().equalsIgnoreCase("sssssss"));
        Assert.assertTrue(snake.color().equalsIgnoreCase("Green"));
    }
}
