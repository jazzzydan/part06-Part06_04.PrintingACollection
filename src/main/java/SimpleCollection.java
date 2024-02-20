
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {

        this.elements.add(element);
    }

    public ArrayList<String> getElements() {

        return this.elements;
    }

    public String toString() {
        String output = "The collection " + this.name + " has " + this.elements.size() + " element";

        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        if (this.elements.size() == 1) {
            return output + ":\n" + this.elements.get(0);
        }

        output += "s:\n";

        for (String element : this.elements) {
            output += element + "\n";
        }

        return output;
    }

    // following solution did not pass the test:

//    public String toString() {
//
//        String printOutput = "The collection " + this.name + " has " + this.elements.size() +
//                " elements:\n";
//
//        if (elements.isEmpty()) {
//            return "The collection " + this.name + " is empty.";
//        }
//
//        if (elements.size() == 1) {
//            printOutput = "The collection " + this.name + " has " + this.elements.size() +
//                    " element:\n";
//        }
//
//        // we form a string from the elements on the list
//        String elementsiInCollection = "";
//
//        for (String element : elements) {
//            elementsiInCollection = elementsiInCollection  + "\n" + element;
//        }
//
//        return printOutput + elementsiInCollection;
//    }
}
