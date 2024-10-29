package tyler.zoo.com;

public class HyenaOct3 extends tyler.zoo.com.AnimalOct3 {
    static int numOfHyenas = 0; // Created static int that keeps track of the num of animals created


    public HyenaOct3() {
        super();
        numOfHyenas++;
    }


    // Create a constructor that will have all the fields I want.
    public HyenaOct3(String sex, int age, int weight, String animalName, String animalID,
    String animalBirthdate, String animalColor, String animalOrigin){
        super(sex, age, weight, animalName, animalID, animalBirthdate, animalColor, animalOrigin);
        numOfHyenas++;
    }

}