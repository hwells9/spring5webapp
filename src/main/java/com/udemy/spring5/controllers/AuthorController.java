package com.udemy.spring5.controllers;

import com.udemy.spring5.model.Author;
import com.udemy.spring5.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hwells on 2019-08-07
 * Package: com.udemy.spring5.controllers
 * Description:
 */

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    private String getAuthors(Model model){

        model.addAttribute("authors", authorRepository.findAll());

        return "Authors";

    }
}
