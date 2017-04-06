package spring.test.implementations.performers;

import spring.test.exceptions.PerformanceException;
import spring.test.interfaces.MagicBox;
import spring.test.interfaces.Performer;

/**
 * Created by andrew_yashin on 3/27/17.
 */
public class Magician implements Performer {
    private String magicWords;
    private MagicBox magicBox;
    public Magician() {
    }


    public String getMagicWords() {
        return magicWords;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    public MagicBox getMagicBox() {
        return magicBox;
    }

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println(magicWords);
        System.out.println(magicBox.getContents());

    }
}
