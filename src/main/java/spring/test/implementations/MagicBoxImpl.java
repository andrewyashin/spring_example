package spring.test.implementations;

import spring.test.interfaces.MagicBox;

/**
 * Created by andrew_yashin on 3/27/17.
 */
public class MagicBoxImpl implements MagicBox {
    public MagicBoxImpl() {
    }

    @Override
    public String getContents() {
        return "A beautiful assistant";
    }
}
