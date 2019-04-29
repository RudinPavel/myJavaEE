package ru.vsu.human.boundary;

import ru.vsu.human.entity.Human;
import ru.vsu.persistence.HumanDAO;

import java.util.List;

public class HumanService {

    private HumanDAO myHumanDao = new HumanDAO();

    public void add(Human human){
        myHumanDao.add(human);
    }

    public void delete(){

    }

    public void update(){

    }

    public List<Human> findAll(){
        //List<Human> result
    }

    public Human findById(Long id){

    }
}
