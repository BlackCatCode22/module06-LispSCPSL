// TD 10/03/2024
// zooVersion01.java

package tyler.zoo.com;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        System.out.println("\nWelcome to my Zoo Program!\nIn this zoo program, we currently have four animals to go by...\nHyena\nLion\nTiger\nBear\nLets take a look at all of their names:\n");


        String filePath = "animalNames.txt";
        AnimalNameListsWrapper animalLists = Utilities.createAnimalNameLists(filePath);

        // Access the hyena names list
        ArrayList<String> listOfHyenaNames = animalLists.getHyenaNameList();

        // Use a "for-each" loop to output each hyena name
        System.out.println("Hyena Names: ");
        for (String hyenaName : listOfHyenaNames) {
            System.out.println(hyenaName);
        }

        // Similarly, you can do this for the other animal lists
        ArrayList<String> listOfLionNames = animalLists.getLionNameList();
        System.out.println("\nLion Names: ");
        for (String lionName : listOfLionNames) {
            System.out.println(lionName);
        }

        ArrayList<String> listOfTigerNames = animalLists.getTigerNameList();
        System.out.println("\nTiger Names: ");
        for (String tigerName : listOfTigerNames) {
            System.out.println(tigerName);
        }

        ArrayList<String> listOfBearNames = animalLists.getBearNameList();
        System.out.println("\nBear Names: ");
        for (String bearName : listOfBearNames) {
            System.out.println(bearName);
        }

        System.out.println("\n\n");


        BufferedReader reader = null;

        String aniSex;
        String aniSpecies;


        // Make sure to redirect the animal.txt file directory in case of error.
        try {
            reader = new BufferedReader(new FileReader("C:/Users/tyler/midterm project/arrivingAnimals.txt"));
            String line;

            // Read each line until the end of the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                // Parse this line of text.
                String[] arrayOfStrPartsOnComma = line.split(", ");
                // output the array elements
                // this is a for : each loop - very handy when examining array elements.

                System.out.println("\n");

                int elementNum = 0;
                for (String thePart : arrayOfStrPartsOnComma) {
                    System.out.println("Element #" + elementNum + " of 'arrayOfStrPartsOnComma' is: " + thePart);
                    elementNum++;
                }


                String aniColor;
                String aniWeight;
                String aniOrigin01;
                String aniOrigin02;
                String aniAge;
                String aniID;

                aniColor = arrayOfStrPartsOnComma[2];
                aniWeight = arrayOfStrPartsOnComma[3];
                aniOrigin01 = arrayOfStrPartsOnComma[4];
                aniOrigin02 = arrayOfStrPartsOnComma[5];

                System.out.println("\n");


                String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
                elementNum = 0;
                for (String thePart : arrayOfStrPartsOnSpace) {
                    System.out.println("Element #" + elementNum + " of the string is: " + thePart);
                    elementNum++;
                }



                // Get animal's sex and species and age
                aniAge = arrayOfStrPartsOnSpace[0];
                // make this an int.
                int intAniAge = Integer.parseInt(aniAge);
                aniSex = arrayOfStrPartsOnSpace[3];
                aniSpecies = arrayOfStrPartsOnSpace[4];
                System.out.println("\nAnimal's Sex: " + aniSex);
                System.out.println("Animal's Species: " + aniSpecies);
                System.out.println("Animal's Color: " + aniColor);
                System.out.println("Animal's Weight: " + aniWeight);
                System.out.println("Animal's Origin #1: " + aniOrigin01);
                System.out.println("Animal's Origin #2: " + aniOrigin02);
                System.out.println("\n");


                String[] arrayOfStrPartsOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
                elementNum = 0;
                for (String thePart : arrayOfStrPartsOnSpace02) {
                    System.out.println("Element #" + elementNum + " of 'arrayOfStrPartsOnSpace02' is: " + thePart);
                    elementNum++;
                }

                System.out.println("\n");


                // Create the right animal object for this arriving animal.
                if (aniSpecies.equals("hyena")) {
                    System.out.println("This animal is identified as a Hyena!");
                    // Create a hyena object and attach to the hyena ArrayList;
                    aniID = Utilities.calcAnimalID("hyena");
                    System.out.println("\nAnimal's ID is: " + aniID);

                    // Get a hyena name
                    String myName;
                    // Pop a name from the list of hyena names
                    myName = listOfHyenaNames.removeFirst();

                    System.out.println("The hyena's name is: " + myName);

                    HyenaOct3 Hyena = new HyenaOct3(aniSex, intAniAge, 99, "to be named", "animalID",
                            "animalBirthDate", aniColor, aniOrigin01 + aniOrigin02);
                    System.out.println("The new hyena's color is: " + Hyena.getAnimalColor());
                }


                if (aniSpecies.equals("lion")) {
                    System.out.println("This animal is identified as a Lion!");
                    // Create a hyena object and attach to the lion ArrayList;
                    aniID = Utilities.calcAnimalID("lion");
                    System.out.println("\nAnimal's ID is: " + aniID);

                    String myName;
                    myName = listOfLionNames.removeFirst();

                    System.out.println("The lion's name is: " + myName);

                    Lion Lion = new Lion(aniSex, intAniAge, 99, "to be named", "animalID",
                            "animalBirthDate", aniColor, aniOrigin01 + aniOrigin02);
                    System.out.println("The new lion's color is: " + Lion.getAnimalColor());
                }


                if (aniSpecies.equals("tiger")) {
                    System.out.println("This animal is identified as a Tiger!");
                    // Create a hyena object and attach to the tiger ArrayList;
                    aniID = Utilities.calcAnimalID("tiger");
                    System.out.println("\nAnimal's ID is: " + aniID);

                    String myName;
                    myName = listOfTigerNames.removeFirst();

                    System.out.println("The tiger's name is: " + myName);

                    Tiger Tiger = new Tiger(aniSex, intAniAge, 99, "to be named", "animalID",
                            "animalBirthDate", aniColor, aniOrigin01 + aniOrigin02);
                    System.out.println("The new tiger's color is: " + Tiger.getAnimalColor());
                }


                if (aniSpecies.equals("bear")) {
                    System.out.println("This animal is identified as a Bear!");
                    // Create a hyena object and attach to the bear ArrayList;
                    aniID = Utilities.calcAnimalID("bear");
                    System.out.println("\nAnimal's ID is: " + aniID);

                    String myName;
                    myName = listOfBearNames.removeFirst();

                    System.out.println("The bear's name is: " + myName);

                    Bear Bear = new Bear(aniSex, intAniAge, 99, "to be named", "animalID",
                            "animalBirthDate", aniColor, aniOrigin01 + aniOrigin02);
                    System.out.println("The new bear's color is: " + Bear.getAnimalColor());
                }


                String ageInYears = arrayOfStrPartsOnSpace[0];
                String animalBirthSeason = arrayOfStrPartsOnSpace02[2];
                System.out.println("The age in years of the animal is: " + ageInYears);
                System.out.println("The season of birth of the animal is: " + animalBirthSeason);




                // Unit test
                tyler.zoo.com.AnimalOct3 myNewAnimal = new tyler.zoo.com.AnimalOct3("Male", 4, 70, "Zig",
                        "Hy01", "2020-3-21", "Brown Spots", "from San Diego Zoo");


                // Prove it
                System.out.println("Animal's birthdate (in YYYY-MM-DD) is: " + Utilities.calcAnimalBirthDate(Integer.parseInt(ageInYears), animalBirthSeason));
                System.out.println("\n-------------------------------------------------\n");




            }
        } catch (IOException e) {
            // Handle exceptions, such as file not found or I/O errors
            e.printStackTrace();
        } finally {
            // Close the BufferedReader in the finally block to ensure it gets closed
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}