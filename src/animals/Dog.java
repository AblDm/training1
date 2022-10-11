package animals;

import java.util.Arrays;

public class Dog extends Pet implements Trained {


    public static final String CMD_SIT = "Сидеть";
    public static final String CMD_VOICE = "Голос";
    public static final String CMD_FETCH = "Аппорт";
    public static final String CMD_LIE_DOWN = "Лежать";

    public enum TrainedCommand {CMD_SIT("Сидеть"), CMD_VOICE("Голос"), CMD_FETCH("Аппорт"),CMD_LIE_DOWN("Лежать");
        private final String voiceCommand;

        public String getVoiceCommand() {
            return voiceCommand;
        }

        TrainedCommand(String voiceCommand) {
            this.voiceCommand = voiceCommand;
        }
    }


    private TrainedCommand [] trainedCommands = new TrainedCommand [0];

    public Dog(String name, int age) {
        super (name, age);
    }

    @Override
    public void talk() {

    }

    @Override
    public void eat() {
        System.out.println ("Насыпают корм для собак");
        System.out.println ("Дают воду");
    }

    @Override
    public String[] getTrainedCommands() {
        String [] commands = new String[trainedCommands.length];
        for (int i = 0; i < trainedCommands.length; i++) {
            commands[i] = trainedCommands[i].name ();
        }  return commands;

    }

    @Override
    public String[] getAllCommands() {
        String [] commands = new String[TrainedCommand.values ().length];
        for (int i = 0; i < commands.length; i++) {
            commands[i] = TrainedCommand.values ()[i].name ();
        }  return commands;
    }

    @Override
    public void doCommand(String command) {

        TrainedCommand trainedCommand = TrainedCommand.valueOf (command);
        System.out.println ("Выполняю команду" + command);
        switch (trainedCommand){
            case CMD_SIT:

                System.out.println ("Выполнена команда сидеть");
            case CMD_FETCH:

                System.out.println ("Выполнена команда аппорт");
                break;
            case CMD_VOICE:
                talk ();
                break;
            case CMD_LIE_DOWN:

                System.out.println ("Выполнена команда Лечь");
                break;
            default:
                System.out.println ("Нет такой команды");
        }

    }

    @Override
    public void train(String command) {
        TrainedCommand trainedCommand = TrainedCommand.valueOf (command);
        TrainedCommand.valueOf (command
        );
        trainedCommands = Arrays.copyOf (trainedCommands , trainedCommands.length + 1 );
        trainedCommands [trainedCommands.length-1] = trainedCommand;
    }
}
