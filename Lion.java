package tyler.zoo.com;

public class Lion extends tyler.zoo.com.AnimalOct3 {
    static int numOfLions = 0; // Created static int that keeps track of the num of animals created


    public Lion() {
        super();
        numOfLions++;
    }


    // Create a constructor that will have all the fields I want.
    public Lion(String sex, int age, int weight, String animalName, String animalID,
                String animalBirthdate, String animalColor, String animalOrigin){
        super(sex, age, weight, animalName, animalID, animalBirthdate, animalColor, animalOrigin);
        numOfLions++;
    }

}