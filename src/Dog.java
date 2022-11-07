import java.io.Serializable;

public class Dog implements Serializable {

    //Properties
    private String dogName;
    private String dogBreed;
    private int dogAge;
    private String dogAddress;

    //Constructor
    public Dog(String dogName, String dogBreed, int dogAge, String dogAddress) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogAge = dogAge;
        this.dogAddress = dogAddress;
    }

    //Empty constructor
    public Dog() { }

    //Getters and Setters


    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public String getDogAddress() {
        return dogAddress;
    }

    public void setDogAddress(String dogAddress) {
        this.dogAddress = dogAddress;
    }

    //Methods

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogBreed='" + dogBreed + '\'' +
                ", dogAge=" + dogAge +
                ", dogAddress='" + dogAddress + '\'' +
                '}';
    }
}
