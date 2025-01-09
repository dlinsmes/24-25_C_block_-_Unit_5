//a class is a blueprint or template for
//something you want to represent in a program
public class Car {

    //instance variables
    //characteristics that each Car will have
    //-but each specific example of a Car that we create
    //can have different values for these vars

    String name;
    String color;

    //the private modifier protects the variable so that it can't
    //be accessed or changed by other classes

    //all instance variables should be made private
    //to control whether and how other classes can access or modify
    //the data

    //-a car's total miles should only ever increase
    private int totalMiles;

    int mpg;
    double fuelCapacity;
    double fuelRemaining;

    //constructor - looks like a method
    //-used to create an object (one specific example) of
    //this class
    //format is public, no return type, method name is
    //the same as the class name
    public Car(){
        //constructors should set initial values for all
        //instance variables
        name = "George";
        color = "grey";
        totalMiles = 30000;
        mpg = 5;
        fuelCapacity = 15.6;
        fuelRemaining = 1;
    }

    //overloaded constructors - have differing params
    //that can modify how the instance vars are initialized
    public Car(String n, String c, int totalMiles, int mpg, double fc, double fr) {
        name = n;
        color = c;

        //when the param has the same name as the instance var,
        //use "this" to specify the instance var
        this.totalMiles = totalMiles;
        this.mpg = mpg;

        //"this" is not necessary (but doesn't hurt)
        //if the param has a different name
        this.fuelCapacity = fc;
        this.fuelRemaining = fr;
    }


    //accessor method aka get method aka getters
    //to allow read access of private data

    //format is public, return type matches the var type,
    //name is getVariable
    //-just return the private variable
    public int getTotalMiles(){
        return totalMiles;
    }

    //mutator method aka set method aka setters
    //allow other classes to modify private data

    //return type is void
    //param is optional, typically the same data type as the instance var
    public void setTotalMiles(int newMiles) {
        if (newMiles > totalMiles) {
            totalMiles = newMiles;
        }
        else {
            System.out.println("new miles must be greater that previous total miles");
        }
    }

    public void driveTilEmpty() {
        double milesDriven = fuelRemaining*mpg;
        totalMiles += (int)milesDriven;
        fuelRemaining = 0;
        System.out.println("vroom vroom - no fuel left :(");
    }
}
