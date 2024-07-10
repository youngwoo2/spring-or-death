package com.sh.spring_or_death.regist.controller;

import com.sh.spring_or_death.regist.model.dto.MemberDto;
import com.sh.spring_or_death.regist.model.service.RegistService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/regist")
public class RegistController {
    private final RegistService registService;

    @GetMapping("/regist")
    public void showRegistForm() {
    }

    @GetMapping("/checkEmail")
    @ResponseBody
    public String checkEmail(@RequestParam("email") String memberEmail) {
        log.debug("memberEmail = {}", memberEmail);
        MemberDto memberDto = registService.checkEmail(memberEmail);
        if (memberDto == null) {
            return "success";
        } else {
            return "fail";
        }

    }

}
