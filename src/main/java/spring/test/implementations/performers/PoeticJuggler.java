package spring.test.implementations.performers;

import spring.test.exceptions.PerformanceException;
import spring.test.interfaces.Poem;

/**
 * Created by andrew_yashin on 3/25/17.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem){
        super();
        this.poem = poem;
    }

    public PoeticJuggler(Poem poem, int beanBags){
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.tell();
    }
}
