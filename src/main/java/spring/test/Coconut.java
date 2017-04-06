package spring.test;

import spring.test.interfaces.Lime;

/**
 * Created by andrew_yashin on 4/6/17.
 */
public class Coconut {
    private Lime lime;

    public Lime getLime() {
        return lime;
    }

    public void setLime(Lime lime) {
        this.lime = lime;
    }

    public void sing(){
        System.out.println("Bla bla bla1");
        System.out.println("Bla bla bla2");
        System.out.println("Bla bla bla3");
        System.out.println("Bla bla bla4");
        System.out.println(lime.drink());
    }
}
