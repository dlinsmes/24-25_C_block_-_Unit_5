import java.util.ArrayList;

public class ListRemoval {
    public static void main(String [] args) {
        ArrayList<String> words = new ArrayList<String> ();
        words.add("a");
        words.add("b");
        words.add("c");
        words.add("d");
        words.add("e");

        //doesn't work - removes every other item bc the indices
        //update every time an item is removed while i is increasing in the loop
        for (int i = 0; i < words.size(); i++) {
            words.remove(i);
        }

        //works - keeps i at 0 by counteracting i++
//        for (int i = 0; i < words.size(); i++) {
//            words.remove(i);
//            i--;
//        }

        //also works - iterate backwards so other list indices are not modified
        for (int i = words.size()-1; i>= 0; i--) {
            words.remove(i);
        }

        System.out.println(words);
    }
}
