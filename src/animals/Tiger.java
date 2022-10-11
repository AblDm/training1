package animals;

public class Tiger extends Pet implements Trained {
    public Tiger(Object name) {
        super (name);
    }

    @Override
    public String[] getTrainedCommands() {
        return new String[0];
    }

    @Override
    public String[] getAllCommands() {
        return new String[0];
    }

    @Override
    public void doCommand(String command) {

    }

    @Override
    public void train(String command) {

    }

    @Override
    public void talk() {

    }

    @Override
    public void eat() {

    }
}
