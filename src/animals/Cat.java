package animals;

import java.time.LocalDate;
import java.util.Arrays;

public class Cat {
    public Breed setBreed;
    private String name;
    private int birthYear;
    public Cat [] friends;

    private static int count;

    public static int getCount() {
        return count;
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
    public void setName(String name) {
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
    public Cat(FavToy toy) {
        this.toy = toy;
    }

    private FavToy toy;
    public FavToy getToy() {
        return toy;
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

//
    public Cat (String name){
        this(name, LocalDate.now ().getYear ());

    }
    public Cat (String name, int age){

        if (age >=0) {
            this.birthYear= LocalDate.now ().getYear () - age;
        }
        else  {this.birthYear= Math.abs(age);}
        this.name = name;
        friends = new Cat[0];
        count++;
    }

    public void meow() {
        System.out.println ("мяу");
        System.out.println ("мне "+ getAge () + " лет");
        System.out.println ("меня  зовут " + name);
    }
   public Cat[] getFriends(){
        if (friends == null) {
            friends = new Cat[0];
        }
        return friends;
    }
    public void addFriend(Cat friend) {

        this.friends = Arrays.copyOf (getFriends (), getFriends ().length + 1 );
        this.friends[this.friends.length-1] = friend;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return LocalDate.now ().getYear () - birthYear;
    }
    public void setName(String name) {
        if (name==null && name.isEmpty () && name.isBlank ()){
        this.name = name;
    } else {
            this.name = "кот";
        }
    }
}
