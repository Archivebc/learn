package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aopcontroller {

    @RequestMapping(value = "/curry")
    public void curry() {
        System.out.println("curry上场打球了");
    }

    @RequestMapping(value = "/harden")
    public void harden() {
        System.out.println("harden上场打球了");
    }

    @RequestMapping(value = "/jokic")
    public void jokic() {
        System.out.println("jokic上场打球了");
    }

    @RequestMapping(value = "/durant/{point}")
    public void durant(@PathVariable("point") int point) {
        System.out.println("durant上场打球了");
    }
}
