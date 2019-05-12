package ru.vsu.persistence;


import ru.vsu.human.entity.Human;


public class HumanDAO extends DAO<Human> {

    public HumanDAO() {
        super.tableName = "users";
        super.columns = new String[] {"name", "age"};
    }
}
