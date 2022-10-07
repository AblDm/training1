package animals;
import java.time.LocalDate;


public abstract class Pet  {
    public   String name;
    public  Integer birthYear;

    public   String address;
    public  String phone;

    public Pet(Object name) {

    }


    public abstract void talk();
    public abstract void eat();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Pet(String name, int age) {
        this.setName (name);


        if (age >=0) {
            this.birthYear= LocalDate.now ().getYear () - age;
        }
        else  {this.birthYear= Math.abs(age);}
    }

    public int getBirthYear() {
        return birthYear;
    }
    public int getAge() {
        return LocalDate.now ().getYear () - birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
