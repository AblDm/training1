package animals;

import com.sun.source.tree.LiteralTree;

public class Parrot extends Pet {
    private String name;
    private int birthYear;
    private boolean talking;
    private String breed;

    public Parrot(String name) {
        super(name);
    }

    public void talk(){
        System.out.println ("Hello!");
    }

    public void talk(String word)
    {System.out.println ("Hello!");
        System.out.println (word);}


    public void talk(String... words) {
        talk ();
        for (String word : words) {
            System.out.println (word);
        }
    }
    @Override
    public void eat() {

    }

    public Parrot(String name, int birthYear) {
        super (name,birthYear);

    }

   @Override
    public String getName() {
        return name ;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isTalking() {
        return talking;
    }

    public void setTalking(boolean talking) {
        this.talking = talking;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", talking=" + talking +
                ", breed='" + breed + '\'' +
                '}';
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
