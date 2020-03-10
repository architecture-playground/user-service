package com.playground.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RequestMapping("/")
@RestController
public class RootController {

    protected static final String SWAGGER_UI_HTML = "redirect:/openapi-ui.html";

    @GetMapping
    public ModelAndView root() {
        log.info("Root request redirected to {}", SWAGGER_UI_HTML);
        return new ModelAndView(SWAGGER_UI_HTML);
    }
}
