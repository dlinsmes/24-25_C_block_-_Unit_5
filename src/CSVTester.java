import java.util.ArrayList;

public class CSVTester {
    public static void main(String [] args) {

        ArrayList<String[]> demoData = CSVImporter.getData("Demo.csv");

        //start at 1 (instead of 0) so the header row with column titles
        //doesn't get parsed as an int incorrectly
        for (int i = 1; i < demoData.size(); i++) {

            String [] dataRow = demoData.get(i);
            for (int j = 0; j < dataRow.length; j++) {
                System.out.print(dataRow[j] + "\t");
            }
            System.out.println();

            //City needs a String for name, String for lang, int for pop
            String name = dataRow[0];
            String lang = dataRow[1];

            //since pop needs to be an int, convert the string into an int
            int pop = Integer.parseInt(dataRow[2]);

            City c = new City(name, lang, pop);
            System.out.println(c);
            System.out.println();
        }

    }
}
