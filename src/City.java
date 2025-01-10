public class City {

    //instance vars - every object gets its own
    //separate values
    private String name;
    private String language;
    private int population;
    private boolean lockdown;

    //constructor
    //no return type, name is the same as the class name
    public City(String name, String lang, int pop) {
        //"this" refers to instance var
        this.name = name;
        language = lang;
        population = pop;

        //constructors should initialize all instance var
        //values, even if there's no param for it
        lockdown = false;
    }

    //accessors/get methods

    //return type matches the instance var type
    public String getName() {
        return name;
    }

    public String getLanguage() { return language; }

    public int getPopulation() { return population; }

    public boolean getLockdown() { return lockdown; }

    //accessors aka set methods - usually void

    public void setLockdown() {
        lockdown = !lockdown;
    }

    //will get called automatically
    //when you print an object
    public String toString() {
        //produce useful information about the object

        return "Name: " + name +
                "\nLangauge: " + language +
                "\nPopulation: " + population +
                "\nLockdown: " + lockdown;
    }

}
