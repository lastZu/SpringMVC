package org.lastzu.springmvc.dao;

import org.lastzu.springmvc.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people;
    private static int  counter;

    {
        people = new ArrayList<>();
        people.add(new Person(++counter, "Brus"));
        people.add(new Person(++counter, "Leny"));
        people.add(new Person(++counter, "Kent"));
        people.add(new Person(++counter, "Wain"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElse(null);
    }
}
