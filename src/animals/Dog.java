package animals;

public class Dog extends Pet {


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
}
