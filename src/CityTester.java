public class CityTester {

    public static void main(String [] args) {

        //when no constructor is defined for a class,
        //a default no-param constructor is available to use
        //and instance var values will be set to 0/0.0/false/null

        //once a constructor is defined, then the default no-param
        //constructor is no longer usable

//        City c = new City();

        City c = new City("la", "english", 10);

        //print info from object c
        //private var - can't access
//        System.out.println(c.name);
        System.out.println(c.getName());
        System.out.println(c.getLanguage());
        System.out.println(c.getPopulation());
        System.out.println(c.getLockdown());

        c.setLockdown();

        System.out.println(c.getLockdown());

        System.out.println();

        //until you define toString() in a class -
        //printing an object
        //will output the memory location (isn't useful)
        System.out.println(c);

        City c2 = new City("new york", "english", 3);

        System.out.println();
        System.out.println(c2);

        //array of City objects
        City [] cities = new City [3];

        //save the existing objects into the array
        cities[0] = c;
        cities[1] = c2;

        //make new object by calling constructor and save to array
        cities[2] = new City("Mexico City", "Spanish", 30000000);

        System.out.println();

        //print the names of each city in the array
        for (int i = 0; i < cities.length; i++ ){
            //call getName() from each object in the array
            System.out.println(cities[i].getName());
        }

        System.out.println();

        //print only the cities with english for language
        for (int i = 0; i < cities.length; i++) {
            if(cities[i].getLanguage().equals("english")) {
                System.out.println(cities[i].getName());
            }

            //same thing but with steps split up
            City current = cities[i];
            String currentLang = current.getLanguage();
            if(currentLang.equals("english")) {

            }
        }

        System.out.println();
        for (City ci: cities) {
            //ci will temporarily be each object in the array as
            //the loop progresses
            if (ci.getLanguage().equals("english")) {
                System.out.println(ci.getName());
            }
        }

    }
}
