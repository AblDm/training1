import animals.*;
import animals.Cat.Breed;
import animals.Cat.FavToy;

public class Main {
    public static void main(String[] args) {
        Breed brSh = new Breed ("Британская короткошёрстная", "ГБ", "короткая");
        Cat murzik;
        murzik = new Cat ("Мурзик", 2);
        murzik.setBreed = brSh;

        murzik.meow ();


        Cat begrmot = new Cat ("Begemot", 2);


        System.out.println ("У кота " + murzik.getName () + " " + murzik.getFriends ().length + " друзей");

        murzik.addFriend (begrmot);

        System.out.println ("У кота " + murzik.getName () + " " + murzik.getFriends ().length + " друзей");

        murzik.friends[0].talk ();


        Cat.getCount ();
        System.out.println (Cat.getCount ());
        FavToy murzikFavToy = murzik.new FavToy ("Рыбка", "заводная");
        System.out.println (murzikFavToy.getCetName ());

        murzik.eat ();
        Dog sharik = new Dog ("Шарик", 1);
        Parrot kesha = new Parrot ("Кеша", 1);
        murzik.addFriend (kesha);
        murzik.addFriend (sharik);
        System.out.println ("У кота " + murzik.getName () + " " + murzik.getFriends ().length + " друзей");

        Tiger tiger = new Tiger ("Тигра");

        checkTrained (sharik);
        sharik.train (Dog.CMD_LIE_DOWN);







    }
    public static void checkTrained  (Trained... animals){

        for (Trained animal : animals) {
            for (String command : animal.getTrainedCommands ()) {
                animal.doCommand (command);
            }
        }
    }
}
