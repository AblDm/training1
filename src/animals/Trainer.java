package animals;

import org.jetbrains.annotations.NotNull;

public class Trainer <T extends Pet & Trained> {
    private String name;
    private String grade;

    public Trainer(String name) {
        this.name = name;
    }

    public void train ( T pet)
    {
        System.out.println ( "Начинаю тренировку ["+ pet.getName ()+ "]");
        for (String command : pet.getAllCommands ()) {
        pet.train (command);
            System.out.println ("Обучаю команде" + command);
        }

        System.out.println ( "Заканчиваю тренировку ["+ pet.getName ()+ "]");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
