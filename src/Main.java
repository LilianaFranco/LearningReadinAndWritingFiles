import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Dogs I need to walk
        Dog dog1 = new Dog("Armando", "Bulldog", 4, "Calle jardin");
        Dog dog2 = new Dog("Beto", "Golden retriever", 4, "Calle jardin");
        Dog dog3 = new Dog("Celino", "Beagle", 4, "Calle jardin");
        Dog dog4 = new Dog("Dario", "Poodle", 4, "Calle jardin");

        List<Dog> monday = new ArrayList<Dog>();
        List<Dog> tuesday = new ArrayList<Dog>();
        List<Dog> wednesday = new ArrayList<Dog>();
        List<Dog> thursday = new ArrayList<Dog>();
        List<Dog> friday = new ArrayList<Dog>();

        monday.add(dog1);
        wednesday.add(dog1);
        friday.add(dog1);

        monday.add(dog2);
        tuesday.add(dog2);
        wednesday.add(dog2);
        thursday.add(dog2);
        friday.add(dog2);

        monday.add(dog3);
        tuesday.add(dog3);
        wednesday.add(dog3);
        thursday.add(dog3);
        friday.add(dog3);

        tuesday.add(dog4);
        thursday.add(dog4);

        try {
            //Process to write a new file
            FileOutputStream dogWalksWrite = new FileOutputStream("dailyWalks.txt"); //Create file
            ObjectOutputStream dogWalksWriteObject = new ObjectOutputStream(dogWalksWrite); //Create objects to send to file

            //Add objects
            dogWalksWriteObject.writeObject(monday);
            dogWalksWriteObject.writeObject(tuesday);
            dogWalksWriteObject.writeObject(wednesday);
            dogWalksWriteObject.writeObject(thursday);
            dogWalksWriteObject.writeObject(friday);

            //Close file
            dogWalksWriteObject.close();

            //Process to read an external file
            FileInputStream dogWalksRead = new FileInputStream("dailyWalks.txt"); //Define the file to be read
            ObjectInputStream dogWalksReadObject = new ObjectInputStream(dogWalksRead); //Object to save the data to be read

            //Create array to save objects read
            ArrayList<Dog> dogsPerDay;

            //Loop the file objects and print
            for (int i=0; i<5; i++){
                System.out.println("day" + (i+1));
                dogsPerDay = (ArrayList<Dog>) dogWalksReadObject.readObject();
                for (Dog p: dogsPerDay
                     ) {
                    System.out.println(p);
                }
                System.out.println("===========");
            }
            dogWalksWriteObject.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error creating the file");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}