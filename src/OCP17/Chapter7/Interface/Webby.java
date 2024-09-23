package OCP17.Chapter7.Interface;

public class Webby extends Husky  {
    @Override
    public void play() {

    }
}


abstract class Husky {    // abstract required in class declaration
    protected abstract void play();  // abstract required in method declaration
}

interface Poodle {        // abstract optional in interface declaration
    void play();           // abstract optional in method declaration
}
