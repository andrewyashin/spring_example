package spring.test.implementations.performers;

import spring.test.exceptions.PerformanceException;
import spring.test.interfaces.Instrument;
import spring.test.interfaces.Performer;

import java.util.Collection;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

/**
 * Created by andrew_yashin on 3/25/17.
 */
public class OneManBand implements Performer {
    private Map<String,Instrument> instruments;
    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() throws PerformanceException {

        instruments.forEach((s, instrument) -> {
            System.out.print(s + " : ");
            instrument.play();
        });
    }
}
