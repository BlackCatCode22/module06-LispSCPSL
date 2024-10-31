package tyler.zoo.com;

public class Bear extends tyler.zoo.com.AnimalOct3 {
    static int numOfBears = 0; // Created static int that keeps track of the num of animals created


    public Bear() {
        super();
        numOfBears++;
    }


    // Create a constructor that will have all the fields I want.
    public Bear(String sex, int age, int weight, String animalName, String animalID,
                 String animalBirthdate, String animalColor, String animalOrigin){
        super(sex, age, weight, animalName, animalID, animalBirthdate, animalColor, animalOrigin);
        numOfBears++;
    }

}