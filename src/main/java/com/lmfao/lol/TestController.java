package com.lmfao.lol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    CicsMap cicsMap;

    @GetMapping("/test")
    public String test() {

        return "Test Success";
    }

}
