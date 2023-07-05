package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * You can write more names in to it, read them out or cross them out again.
 */
public class Notebook {

    private List<Person> persons = new ArrayList<>();


    public void writeIn(Person person) {

        this.persons.add(person);
    }


    public String readOut() {

        String names = "";
        for (Person person : persons) {
            names += person.name() + System.getProperty("line.separator") + person.getAddress().toString() + System.getProperty("line.separator");
        }

        return names;
    }


    public void crossOut(String name) {

        for (int i = 0; i < this.persons.size(); i++) {
            Person person = this.persons.get(i);
            if (person.name() == name) {
                this.persons.remove(i);
            }
        }
    }

}
