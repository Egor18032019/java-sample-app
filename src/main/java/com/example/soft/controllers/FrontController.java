package com.example.soft.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "Page Hello World")
@Controller
@RequiredArgsConstructor
public class FrontController {
    @RequestMapping({"/"})
    public String loadUI() {
        return "forward:/index.html";
    }
}
