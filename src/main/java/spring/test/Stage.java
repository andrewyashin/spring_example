package spring.test;

/**
 * Created by andrew_yashin on 3/25/17.
 */
public class Stage {

    private Stage(){}

    private static class StageSingletonHolder{
        public static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }
}
