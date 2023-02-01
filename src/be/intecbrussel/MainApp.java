package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        int x = 10; // stack memory

        // literal
        String name = "Gabriel"; // heap -> string pool
        String name2 = "Gabriel";

        name2 = "Alves";
        name2 = "Vieira";

        // true -> verwijst naar dezelfde plaats in het geheugen
        System.out.println(name == name2);

        // Object
        String name3 = new String("Gabriel");
        String name4 = new String("Gabriel");

        // vergelijk objecten
        System.out.println(name3.equals(name4));

        // string methods
        // uppercase

        name = "Gabriel Alves";
        System.out.println(name.toUpperCase());

        // lowercase
        name = "GABRIEL ALVES";
        System.out.println(name.toLowerCase());

        // length
        name = "Gabriel Alves";
        System.out.println(name.length());

        // isblank
        name = "    ";
        System.out.println(name.isBlank());

        // empty
        System.out.println(name.isEmpty());

        // replace
        name = "Gabriel Alves";
        System.out.println(name.replace("G", "g"));

        // strip -> verwijder alle spatie voor en achter, geen impact op spaties tussen woorden
        name = "  Gabriel Alves ";
        System.out.println(name.strip());

        // stripleading -> spaties vooraan verwijderen
        name = " Gabriel Alves ";
        System.out.println(name.stripLeading());

        // striptrailing -> spaties achteraan verwijderen
        name = " Gabriel Alves ";
        System.out.println(name.stripTrailing());

        // indexOf
        name = "Gabriel Alves";
        System.out.println(name.indexOf("Alves"));

        // contains -> hoofdletter gevolig
        String text = "Hello World";
        System.out.println(text.contains("world"));
        System.out.println(text.toLowerCase().contains("world"));

        // substring
        System.out.println(text.substring(0, 6));
    }
}
