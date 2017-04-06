package spring.test.implementations.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring.test.annotations.Saxophone;
import spring.test.exceptions.PerformanceException;
import spring.test.interfaces.Instrument;
import spring.test.interfaces.Performer;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by andrew_yashin on 3/25/17.
 */
@Component("kenny")
public class Instrumentalist implements Performer {
    private String song;

    @Inject
    @Named("saxophone")
    private Instrument instrument;

    public Instrumentalist() {
    }

    public String getSong() {
        return song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setSong(String song) {
        this.song = song;
    }


    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " song");
        instrument.play();
    }
}
