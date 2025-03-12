package exercises.chapter7;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void display(ArrayList<String> items, String header){
        System.out.printf(header);

        for (String item : items)
            System.out.printf(" %s", item);

        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        items.add("red");
        items.add(0, "white");

        System.out.printf("%nDisplay list contents with counter-controlled loop:");

        for (int counter = 0; counter < items.size(); counter++)
            System.out.printf(" %s", items.get(counter));

        display(items, "%nDisplay list contents with enhanced for statement:");

        items.add("red clearance");
        items.add("white");
        display(items, "List with two new elements:");

        items.remove("white");
        display(items, "Remove first instance of white:");

        items.remove(1);
        display(items, "Remove second list element (red clearance):");

        System.out.printf("\"red\" is %Sin the list%n",
                items.contains("red") ? "": "not ");
        System.out.printf("Size: %S%n", items.size());
    }
}
