package tyler.zoo.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Utilities {
    public static tyler.zoo.com.AnimalNameListsWrapper createAnimalNameLists(String filePath) {

        // Create ArrayLists for each species
        ArrayList<String> hyenaNameList = new ArrayList<>();
        ArrayList<String> lionNameList = new ArrayList<>();
        ArrayList<String> tigerNameList = new ArrayList<>();

        ArrayList<String> bearNameList = new ArrayList<>();
        // Try-with-resources to automatically close the reader
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\BE218\\IdeaProjects\\animalMidterm\\animalNames.txt")))
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