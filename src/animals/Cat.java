package animals;

import java.time.LocalDate;
import java.util.Arrays;

public class Cat extends Pet implements Trained {
    public Breed setBreed;
    private String name;
    private int birthYear;
    public Pet[] friends;

    private static int count;



    public static int getCount() {
        return count;
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

    public static class Breed{
    private String name;
    private String country;
    private String hairType;

        //геттеры и сеттеры к Breed



    public Breed(String name, String country, String hairType) {
     this.name = name;
     this.country = country;
     this.hairType = hairType;}

        public String getName() {
            return name;
        }
    public final void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }
}

public class FavToy {
        private String name;
        private String type;



    public String getName() {
        return name;
    }


    public FavToy(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getCetName (){
        return Cat.this.name;
    }
}


    private FavToy toy;
    public FavToy getToy() {
        return toy;
    }
    public Cat(FavToy toy) {
        super (toy.getName ());
        this.toy = toy;
    }

    public void setToy(FavToy toy) {
        this.toy = toy;
    }
    private Breed breed;

    public void setBreed(Breed breed) {
        if (breed==null){
            this.breed = breed;}
    }
    public Breed getBreed() {
        return breed;
    }

    @Override
    public void talk() {
        meow ();
    }

    @Override
    public void eat() {
        System.out.println ("насыпать корм для котов");
        System.out.println ("налить воду");
    }

    //
    public Cat (String name){
        this(name, 0);

    }
    public Cat (String name, int age){
        super(name,age);
        friends = new Pet[0];
        count++;
    }

    public void meow() {
        System.out.println ("мяу");
        System.out.println ("мне "+ getAge () + " лет");
        System.out.println ("меня  зовут " + getName ());
    }
   public Pet[] getFriends(){
        if (friends == null) {
            friends = new Pet[0];
        }
        return friends;
    }
    public void addFriend(Pet friend) {

        this.friends = Arrays.copyOf (getFriends (), getFriends ().length + 1 );
        this.friends[this.friends.length-1] = friend;

        System.out.println (getName () + " подружился с " + friend.getName ());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return LocalDate.now ().getYear () - birthYear;
    }
    public void setName(String name) {
        this.name = name;
    }

}
