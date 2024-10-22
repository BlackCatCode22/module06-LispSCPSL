package tyler.zoo.com;

public class AnimalOct3 {
    static int numOfAnimals = 0; // Created static int that keeps track of the num of animals created

    public AnimalOct3(String someName) { // Created a constructor for our new Animal Objects
        numOfAnimals++;
    }


    // Constructor that will accept all fields as arguments
    public AnimalOct3(String sex, int age, int weight, String animalName, String animalID,
                      String animalBirthdate, String animalColor, String animalOrigin) {
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthdate = animalBirthdate;
        this.animalColor = animalColor;
        this.animalOrigin = animalOrigin;
    }






    // Create all attributes (fields) needed for our midterm program.
    private String sex;   // sex will be 'male' or 'female'
    private int age = 0; // age will be in years
    private int weight = 0; //weight will be in pounds
    // name will be a string
    private String animalName;
    // animalID
    private String animalID;
    // animal birthday
    private String animalBirthdate;
    //animal color
    private String animalColor;
    // origin will be a string like: "from Friguia park, Tunisia
    private String animalOrigin;





    // Create getters and setters

    public String getAnimalOrigin() {
        return animalOrigin;
    }
    public void setAnimalOrigin(String animalOrigin) {
        this.animalOrigin = animalOrigin;
    }


    public String getAnimalColor() {
        return animalColor;
    }
    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }


    public String getAnimalBirthdate() {
        return animalBirthdate;
    }
    public void setAnimalBirthdate(String animalBirthdate) {
        this.animalBirthdate = animalBirthdate;
    }


    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalID(){
        return this.animalID;
    }


}