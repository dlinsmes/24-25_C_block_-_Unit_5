public class Student {

    //static - a method or variable that's static
    //is shared by the whole class, not a single
    //object

    //non-static - the variable or method belongs
    //to an individual object

    private String name;
    private int id;


    //the values of these static variables are
    //shared by the whole class and all objects
    //made from this class
    private static int studentCount = 0;
    private static String roster = "roster:";
    private static boolean onBreak = false;

    public Student(String name) {
        this.name = name;

        //every time the constructor is called to
        //make a new student object, we increment
        //this counter
        studentCount++;

        //each individual id number is assigned
        //based on the student count, but each id
        //will be different
        //-id is an instance var where each object
        //gets its own value
        id = studentCount;

        //static - only one value for the
        //list of names
        roster += "\n" + name;
    }

    public String getName() {return name; }

    public String toString() {
        return "id: " + id + " - " + name + " - on break: " + onBreak;
    }

    public static String getRoster() {
        return roster;
    }

    //since this is non-static, this
    //needs to be called from an object
    public void setOnBreak() {
        //modify the static variable value
        //for the whole class
        onBreak = !onBreak;
    }
}
