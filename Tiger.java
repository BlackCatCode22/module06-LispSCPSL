package tyler.zoo.com;

public class Tiger extends tyler.zoo.com.AnimalOct3 {
    static int numOfTigers = 0; // Created static int that keeps track of the num of animals created


    public Tiger() {
        super();
        numOfTigers++;
    }


    // Create a constructor that will have all the fields I want.
    public Tiger(String sex, int age, int weight, String animalName, String animalID,
                 String animalBirthdate, String animalColor, String animalOrigin){
        super(sex, age, weight, animalName, animalID, animalBirthdate, animalColor, animalOrigin);
        numOfTigers++;
    }

}