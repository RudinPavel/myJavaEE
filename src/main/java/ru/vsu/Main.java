package ru.vsu;

import ru.vsu.human.boundary.HumanService;
import ru.vsu.human.entity.Human;

public class Main {
    public static void main(String[] args){

        HumanService humanService = new HumanService();

        Human helperHuman = new Human();
        int helperId = 10;

        humanService.add(helperHuman);  // C

        humanService.getAll();  // R
        humanService.getById(helperId);

        humanService.update(helperHuman);  // U

        humanService.delete(helperId);  // D

        System.out.println("ok");

        // DAO абстрактный, конкретные дао включены в сервисы,
        // сервисы в сервлетах, работающих с сервером

        // CRUD - то ли это
        // принимаемые типы, Long id
    }
}
