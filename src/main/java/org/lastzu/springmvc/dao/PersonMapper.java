package org.lastzu.springmvc.dao;

import org.lastzu.springmvc.model.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return new Person(
            resultSet.getInt("id"),
            resultSet.getString("name"),
            resultSet.getInt("age"),
            resultSet.getString("email")
        );
    }
}
