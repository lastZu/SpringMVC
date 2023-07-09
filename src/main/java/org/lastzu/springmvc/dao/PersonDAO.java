package org.lastzu.springmvc.dao;

import org.lastzu.springmvc.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index() {
        String SQL = "Select * From person";
        return jdbcTemplate.query(SQL, new PersonMapper());
    }

    public Person show(int id) {
        String SQL = "SELECT * FROM person WHERE id = ?";
        return jdbcTemplate.query(SQL, new Object[]{id}, new PersonMapper())
                .stream().findAny().orElse(null);
    }

    public void save(Person person) {
        String SQL = "Insert into person values(1, ?, ?, ?)";
        jdbcTemplate.update(
                SQL,
                person.getName(), person.getAge(), person.getEmail()
        );
    }

    public void update(int id, Person updatePerson) {
        String SQL = "UPDATE person SET name=?, age=?, email=? WHERE id=?";
        jdbcTemplate.update(
                SQL,
                updatePerson.getName(), updatePerson.getAge(), updatePerson.getEmail(), id
        );
    }

    public void delete(int id) {
        String SQL = "DELETE FROM person WHERE id=?";
        jdbcTemplate.update(SQL, id);
    }
}
