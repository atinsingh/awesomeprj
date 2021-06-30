import io.pragra.learning.Joke;
import io.pragra.learning.Jokes;
import org.junit.Assert;
import org.junit.Test;

public class JokesTest {

    @Test
    public void dummyTC(){
        System.out.println("DUmmy");
    }

    @Test
    public void jokeTest(){
        Joke joke = Jokes.get();
        Assert.assertEquals("IT is not hard when you are soft", joke.joke());
    }

}
