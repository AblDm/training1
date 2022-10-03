import animals.Cat;
import animals.Cat.Breed;
import animals.Cat.FavToy;
public class Main {
    public static void main(String[] args) {
        Breed brSh = new Breed ("Британская короткошёрстная", "ГБ","короткая");
        Cat murzik = new Cat("Мурзик",2);
        murzik.setBreed = brSh;

        murzik.meow ();


        Cat begrmot = new Cat("Begemot",2);

        begrmot.meow ();

        System.out.println ("У кота " + murzik.getName () + " " + murzik.getFriends ().length + " друзей");

        murzik.addFriend (begrmot);

        System.out.println ("У кота " + murzik .getName ()+ " " + murzik.getFriends ().length + " друзей");

        murzik.friends[0].meow ();


        Cat.getCount ();
        System.out.println (Cat.getCount ());
        FavToy murzikFavToy = murzik.new FavToy ("Рыбка","заводная");
        System.out.println (murzikFavToy.getCetName ());
    }
}