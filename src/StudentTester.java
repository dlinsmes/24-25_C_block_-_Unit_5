import java.util.ArrayList;

public class StudentTester {
    public static void main(String [] args) {
        Student s = new Student("evan");
        System.out.println(s.getName());

        System.out.println(s);

        Student s2 = new Student("jerry");
        System.out.println(s2);

        //a static method (getRoster()) can be called
        //directly from the class
        System.out.println(Student.getRoster());

        //static methods can also be called from
        //specific objects
        System.out.println(s.getRoster());

        //this modifes the static var that's shared
        //by the class
        s.setOnBreak();

        System.out.println(s);
        System.out.println(s2);

        //not a static method - can't call from the class
        //Student.setOnBreak();

        //you can call main() of other classes bc
        //main is always static
        CardTester.main(args);

        CityTester.main(args);

        //Math.random() is static - we know
        //bc we've never made a Math object
        double r = Math.random();

        //Max value is a static variable from the Integer class
        int x = Integer.MAX_VALUE;

        //
        //
        //arrays - a limitation is the length is set and you can't
        //add or remove from the length

        //ArrayLists - size can change dynamically - can add and
        //remove values from the list
        //limitations: can only hold objects, cannot hold primitives
        //primitives: int, double, boolean

        //-need import line at the top

        //declare and initialize an arraylist to hold student objects
        ArrayList<Student> csClass = new ArrayList<Student> ();

        //add a new object at the end of the list
        csClass.add(s);
        csClass.add(s2);

        System.out.println();

        //can directly print an arraylist
        System.out.println(csClass);

        //size instead of length of arraylists
        for (int i = 0; i < csClass.size(); i++) {
            //.get(index) returns the object stored at the index
            System.out.println(csClass.get(i));
        }

        //overloaded add(index, value) that will insert the value
        //into the existing list - nothing gets removed/replaced
        Student s3 = new Student("other jerry");

        //insert between the existing two objects
        csClass.add(1, s3);

        System.out.println(csClass);

        Student s4 = new Student("other evan");

        //to replace an existing value, use .set()
        csClass.set(0, s4);

        System.out.println(csClass);

        //remove accepts an index
        csClass.remove(2);

        System.out.println(csClass);

        csClass.add(s);
        csClass.add(s2);

        System.out.println(csClass);

        //use a loop to print just names of each student
        for (int i = 0; i < csClass.size(); i++) {
            //isolate a single student object
            Student current = csClass.get(i);

            //isolate the name of the current student
            String currentName = current.getName();

            //print the name
            System.out.println(currentName);
        }

        System.out.println();
        for (int i = 0; i < csClass.size(); i++) {
            //can combine the 3 lines for the same outcome
            System.out.println(csClass.get(i).getName());
        }

        System.out.println();

        //same thing with for-each loop
        for (Student st: csClass) {
            System.out.println(st.getName());
        }

    }
}
