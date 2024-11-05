package tyler.zoo.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Utilities {

    public static String calcAnimalID(String animalSpecies) {
        String myID = "";
        if (animalSpecies.contains(("hy"))) {
            int myNumOfHyenas = 0;
            myNumOfHyenas = HyenaOct3.numOfHyenas + 1;
            myID = "Hy0" + myNumOfHyenas;
        }
        if (animalSpecies.contains(("li"))) {
            int myNumOfLions = 0;
            myNumOfLions = Lion.numOfLions + 1;
            myID = "Li0" + myNumOfLions;
        }
        if (animalSpecies.contains(("tig"))) {
            int myNumOfTigers = 0;
            myNumOfTigers = Tiger.numOfTigers + 1;
            myID = "Tig0" + myNumOfTigers;
        }
        if (animalSpecies.contains(("be"))) {
            int myNumOfBears = 0;
            myNumOfBears = Bear.numOfBears + 1;
            myID = "Be0" + myNumOfBears;
        }
        return myID;
    }








    public static String arrivialDate() {
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);
        return strTodaysDate;
    }


    public static String calcAnimalBirthDate(int age, String theSeason) {

        // Current Date
        Date Today = new Date();

        // Define the desired date format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // Format the date and store it in a string
        String strTodaysDate = formatter.format(Today);
        String strTodaysYear = formatterYear.format(Today);

        // Output the result
        System.out.println("Today's date in the format YYYY-MM-DD: " + strTodaysDate);


        // Calculate Birthdates for the following two hyenas
        // 1) 4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        // 2) 12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

        // Write Java code to calculate birthdates for the animal and then create a method
        // that returns a string for the animal's birthdate


        // Input: "4-year old female Hyena; born in Spring
        // Processing: Find the age and birth season, and then use
        // decision control structures to calculate the date.


        String animalBirthdate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(String.valueOf(age));

        // Normalize the input season to lower case for case-insensitive comparison
        String season = theSeason.toLowerCase();

        switch (season) {
            case "spring":
                animalBirthdate = Integer.toString(animalBirthYear) + "-03-21";
                break;
            case "fall":
                animalBirthdate = Integer.toString(animalBirthYear) + "-09-21";
                break;
            case "winter":
                animalBirthdate = Integer.toString(animalBirthYear) + "-12-21";
                break;
            case "summer":
                animalBirthdate = Integer.toString(animalBirthYear) + "-06-21";
                break;
            default:
                animalBirthdate = Integer.toString(animalBirthYear) + "-01-01";
                //    Default case for anything else
                break;
        }
        return animalBirthdate;
    }

    public static tyler.zoo.com.AnimalNameListsWrapper createAnimalNameLists(String filePath) {

        // Create ArrayLists for each species
        ArrayList<String> hyenaNameList = new ArrayList<>();
        ArrayList<String> lionNameList = new ArrayList<>();
        ArrayList<String> tigerNameList = new ArrayList<>();
        ArrayList<String> bearNameList = new ArrayList<>();

        // Try-with-resources to automatically close the reader
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\tyler\\animalNames.txt")))
        {
            String line;
            ArrayList<String> currentList = null;
            while ((line = reader.readLine()) != null) {
                line = line.trim(); // Trim any leading or trailing spaces
                // Check for the species names and assign the appropriate list
                if (line.equals("Hyena Names:")) {
                    currentList = hyenaNameList;
                } else if (line.equals("Lion Names:")) {
                    currentList = lionNameList;
                } else if (line.equals("Tiger Names:")) {
                    currentList = tigerNameList;
                } else if (line.equals("Bear Names:")) {
                    currentList = bearNameList;
                } else if (!line.isEmpty()) {
                    // Add names to the current list
                    String[] names = line.split(",\\s*");
                    for (String name : names) {
                        if (currentList != null) {
                            currentList.add(name);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " +
                    e.getMessage());
        }

// Return the wrapper object containing all lists
        return new tyler.zoo.com.AnimalNameListsWrapper(hyenaNameList, lionNameList,
                tigerNameList, bearNameList);
    }
}