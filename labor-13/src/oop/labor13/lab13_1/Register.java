package oop.labor13.lab13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Register {

    private Map<String, Person> persons = new HashMap<>();

    public void readFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                String[] items = line.split(" ");
//                String name = items[0].trim();
//                int byear = Integer.parseInt(items[1].trim());
//                int dyear = Integer.parseInt(items[2].trim());
                if (items.length == 2) {
                    persons.put(items[0].trim(), new Person(items[0].trim(), Integer.parseInt(items[1].trim())));
                } else {
                    persons.put(items[0].trim(), new Person(items[0].trim(), Integer.parseInt(items[1].trim()), Integer.parseInt(items[2].trim())));
                }
            }
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] items = line.split(" ");
                if (persons.containsKey(items[0].trim())) {
                    persons.get(items[0].trim()).setDyear(Integer.parseInt(items[1].trim()));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Register{" +
                "persons=" + persons +
                '}';
    }


    public void printData() {
        for (String temp : persons.keySet()) {
            String value = persons.get(temp).toString();
            if (persons.get(temp).getDyear() != 0) {
                System.out.println(value);
            }
        }

    }


    public void sortPersons() {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.addAll(persons.values());
        Collections.sort(personArrayList, (e1, e2) -> {
            if (e1.getName().equals(e2.getName())) {
                return e1.getName().compareTo(e2.getName());
            }
            return e1.getName().compareTo(e2.getName());
        });
        for (Person person : personArrayList) {
            if (person.getDyear() == 0) {
                continue;
            }
            System.out.println(person);
        }
    }
}