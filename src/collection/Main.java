package collection;

public class Main {

    public static void main(String[] args) {

        Notebook notebook = new Notebook();
        notebook.writeIn(new Person("Marie", "Curie"));
        notebook.writeIn(new Person("Laura", "Bassi"));
        notebook.writeIn(new Person("", ""));
        notebook.writeIn(new Person("Niels", "Bohr"));

        System.out.println("In the notebook (all names in): \n" + notebook.readOut());

        notebook.crossOut("Niels Bohr");

        System.out.println("Still in the notebook (without Niels Bohr): \n" + notebook.readOut());
    }


}

