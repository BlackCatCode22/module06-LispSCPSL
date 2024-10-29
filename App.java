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
            reader = new BufferedReader(new FileReader("arrivingAnimals.txt"));
            String line;

            // Read each line until the end of the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                // Parse this line of text.
                String[] arrayOfStrPartsOnComma = line.split(", ");
                // output the array elements
                // this is a for : each loop - very handy when examining array elements.
                int elementNum = 0;
                for (String thePart : arrayOfStrPartsOnComma) {
                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnComma is: " + thePart);
                    elementNum++;
                }


                String aniColor;
                String aniWeight;
                String aniOrigin01;
                String aniOrigin02;
                String aniAge;

                aniColor = arrayOfStrPartsOnComma[2];
                aniWeight = arrayOfStrPartsOnComma[3];
                aniOrigin01 = arrayOfStrPartsOnComma[4];
                aniOrigin02 = arrayOfStrPartsOnComma[5];

                System.out.println("\n\n");



                System.out.println("\n");

                String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
                elementNum = 0;
                for (String thePart : arrayOfStrPartsOnSpace) {
                    System.out.println("Element " + elementNum + " of the string is: " + thePart);
                    elementNum++;
                }




                // Get animal's sex and species and age
                aniAge = arrayOfStrPartsOnSpace[0];
                // make this an int.
                int intAniAge = Integer.parseInt(aniAge);
                aniSex = arrayOfStrPartsOnSpace[3];
                aniSpecies = arrayOfStrPartsOnSpace[4];
                System.out.println("\nAnimal's sex: " + aniSex);
                System.out.println("Animal's species: " + aniSpecies);
                System.out.println("Animal's color: " + aniColor);
                System.out.println("Animal's weight: " + aniWeight);
                System.out.println("Animal's origin #1: " + aniOrigin01);
                System.out.println("Animal's origin #2: " + aniOrigin02);
                System.out.println("\n");


                String[] arrayOfStrPartsOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
                elementNum = 0;
                for (String thePart : arrayOfStrPartsOnSpace02) {
                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnSpace02 is: " + thePart);
                    elementNum++;
                }
                System.out.println("\n");


                String ageInYears = arrayOfStrPartsOnSpace[0];
                String animalBirthSeason = arrayOfStrPartsOnSpace02[2];
                System.out.println("The age in years of the animal is: " + ageInYears);
                System.out.println("\nThe season of birth of the animal is: " + animalBirthSeason);


                // Create the right animal object for this arriving animal.
                if (aniSpecies.equals("hyena")) {
                    System.out.println("\n The animal is a Hyena!");
                    // Create a hyena object and attach to the hyena ArrayList;
                    HyenaOct3 Hyena = new HyenaOct3(aniSex, intAniAge, 99, "to be named", "animalID",
                            "animalBirthDate", aniColor, aniOrigin01 + aniOrigin02);
                    System.out.println("The new hyena's color is: " + Hyena.getAnimalColor());
                }


                // Unit test
                tyler.zoo.com.AnimalOct3 myNewAnimal = new tyler.zoo.com.AnimalOct3("Male", 4, 70, "Zig",
                        "Hy01", "2020-3-21", "Brown Spots", "from San Diego Zoo");


                // Prove it
                System.out.println("\nThis is the new animal!\n");
                System.out.println("ID is: " + myNewAnimal.getAnimalID() + " and... name is: " + myNewAnimal.getAnimalName() + "\n");

                System.out.println("Animal birthdate is: " + Utilities.calcAnimalBirthDate(Integer.parseInt(ageInYears), animalBirthSeason));

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