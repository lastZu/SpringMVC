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
        people.add(new Person(++counter, "Brus", 23, "1@mu.lu"));
        people.add(new Person(++counter, "Leny", 33, "2@mu.lu"));
        people.add(new Person(++counter, "Kent", 43, "3@mu.lu"));
        people.add(new Person(++counter, "Wain", 53, "4@mu.lu"));
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

    public void save(Person person) {
        person.setId(++counter);
        this.people.add(person);
    }

    public void update(int id, Person updatePerson) {
        Person person = this.show(id);
        person.setName(updatePerson.getName());
        person.setAge(updatePerson.getAge());
        person.setEmail(updatePerson.getEmail());
    }

    public void delete(int id) {
        Person person = this.show(id);
        this.people.remove(person);
    }
}
