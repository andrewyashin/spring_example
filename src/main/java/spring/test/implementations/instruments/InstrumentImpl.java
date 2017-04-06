package spring.test.implementations.instruments;

import spring.test.interfaces.Instrument;

/**
 * Created by andrew_yashin on 3/25/17.
 */
public class InstrumentImpl implements Instrument {
    private String sound;

    public InstrumentImpl() {
        this.sound = "SOUND SOUND SOUND";
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void play() {
        System.out.println(sound);
    }
}
