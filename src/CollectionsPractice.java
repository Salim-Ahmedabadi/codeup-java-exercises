import java.util.ArrayList;
public class CollectionsPractice {
//    TODO:
//            1. Create a class called CollectionsPractice with a main method.
//            2. Create a static method, upperLastElement, that takes in an array list and
//    returns the array list with last string capitalized. An empty array list
//    should be returned if the passed array list is empty. If the passed array
//    list only has one string, capitalize it.
//            3. In the main method, create an array list of first name strings of three people in Marco.
//            4. Test the upperLastElement method on your array of Marco people.
    public static void upperLastElement(ArrayList<String> strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Salim");
        names.add("Douglas");
        names.add("Kenneth");

//        System.out.println(names);
//        System.out.println((names.indexOf("2").toUpperCase());
    }
}

