package animals;

public interface Trained {
    String[] getTrainedCommands();
    String[] getAllCommands();
    void doCommand (String command);
    void train (String command);


}
