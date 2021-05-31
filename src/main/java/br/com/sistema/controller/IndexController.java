package br.com.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Pq criar isso?? rodrigo tirou essa duvida
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
