package oop.labor14.gyakorlas_vizsga.gyak2;

import java.util.Comparator;

public class PersonFirstNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int lastNameResult = person1.getLastName().compareTo(person2.getLastName());
        if (lastNameResult == 0) {
            return person1.getFirstName().compareTo(person2.getFirstName());
        }
        return lastNameResult;
    }
}
