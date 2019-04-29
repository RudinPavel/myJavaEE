package ru.vsu.human.entity;

import java.util.Objects;

public class Human {

    private Long id;

    private String name;

    private Integer Age;

    public Human() {
    }

    public Human(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        Age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(id, human.id) &&
                Objects.equals(name, human.name) &&
                Objects.equals(Age, human.Age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, Age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Age=" + Age +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }
}

// import javax.persistence.NamedQueries;
// import javax.persistence.NamedQuery;
/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Humans")


  @Id
    @GeneratedValue(strategy = IDENTITY)


    @Column(name = "name")
 */