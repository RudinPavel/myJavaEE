package ru.vsu.human.boundary;

import ru.vsu.human.entity.Human;
import ru.vsu.persistence.HumanDAO;
import java.util.List;


public class HumanService {

    private HumanDAO myHumanDao = new HumanDAO();

    public boolean add(Human human) {
        return myHumanDao.add(human);
    }

    public List<Human> getAll() {
        return myHumanDao.findAll();
    }

    public Human getById(int id) {
        return myHumanDao.findById(id);
    }

    public boolean update(Human human) {
        return myHumanDao.update(human);
    }

    public boolean delete(int id) {
        return myHumanDao.delete(id);
    }
}

 /*
    public void add(Human human){
        // myHumanDao.add(human);
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
        */