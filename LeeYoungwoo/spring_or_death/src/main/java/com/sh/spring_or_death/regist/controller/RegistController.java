package com.sh.spring_or_death.regist.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequestMapping("/regist")
public class RegistController {

    @GetMapping("/regist")
    public void showRegistForm() {
    }

    @GetMapping("/checkEmail")
    @ResponseBody
    public String checkEmail(@RequestParam String memberEmail) {
        log.debug("memberEmail = {}", memberEmail);
        return "";
    }

}
