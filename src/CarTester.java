public class CarTester {
    public static void main(String [] args) {
        //make an object (one specific instance)
        //of the Car class

        //calls the constructor to assign initial values
        //for Car c
        Car c = new Car();

        //access the name variable from
        //the object c
        System.out.println(c.name);

        //change the name of car c
        c.name = "Jorge";
        System.out.println(c.name);

        //make another object
        Car c2 = new Car();

        //each object gets its own separate copies
        //of instance vars that can all of different
        //values
        System.out.println("c2's name is" + c2.name);
        System.out.println("c's name is " + c.name);

        Car c3 = new Car("chris", "white", 100, 60, 20, 5);
        System.out.println("c3's name is " + c3.name);

        //can't directly access the private var from a different class
        //c3.totalMiles = 9;
        //System.out.println(c3.totalMiles);

        //call the public get method to read the private data;
        System.out.println("c3's total miles: " + c3.getTotalMiles());


        //set c3's total miles to 200
        c3.setTotalMiles(200);
        System.out.println("c3's total miles: " + c3.getTotalMiles());

        c3.setTotalMiles(1);
        System.out.println("c3's total miles: " + c3.getTotalMiles());

        //drive c2 until empty
        c2.driveTilEmpty();
        System.out.println("fuel remaining: " + c2.fuelRemaining);
        System.out.println("total miles: " + c2.getTotalMiles());
    }
}
