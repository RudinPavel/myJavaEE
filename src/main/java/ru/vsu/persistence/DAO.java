package ru.vsu.persistence;

import java.util.List;

public abstract class DAO<T> {

    // DataBase Access Object, абстрактный класс содержит CRUD методы
    // HumanDAO наследуется от DAO и содержит конкретные CRUD методы для сущности человек

    private static final String POSTGRES_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String POSTGRES_NAME = "postgres";
    private static final String POSTGRES_PASSWORD = "111111";
    protected String tableName;
    protected String[] columns;

    public DAO() {
        try {
            Class.forName("org.postgresql.Driver"); // проверка наличия драйвера
        } catch (Exception e) {
            System.out.println("Driver in trouble!");
        }
    }

    public boolean add(T entity){
        return true;
    }

    public List<T> findAll(){
        return null;
    }

    public T findById(int id){
        return null;
    }

    public boolean update(T entity){
        return true;
    }

    public boolean delete(int id){
        return true;
    }
}
/*
    protected abstract List<T> convertFrom(ResultSet resultSet) throws SQLException;

    private List<T> executeSelectQuery(String query){
        try (Connection connection =
                     DriverManager.getConnection(POSTGRES_URL, POSTGRES_NAME, POSTGRES_PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(query)){
            ResultSet resultSet = preparedStatement.executeQuery();
            return convertFrom(resultSet);
        } catch (SQLException e) {
            System.out.println("Connection to DataBase failed!");
            return Collections.emptyList();
        }
    }

    public List<T> findAll(){ //
        final String query = String.format("select * from %s", tableName);
        return executeSelectQuery(query);
    }


    public T findById(Long id){

    }

    public boolean add(T entity){

    }

    public boolean delete(Long id){

    }

    public boolean update(T entity){

    }

}


import java.sql.*;
import java.util.Collections;
*/