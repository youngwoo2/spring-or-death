package com.sh.spring_or_death.regist.controller;

import com.sh.spring_or_death.regist.model.dto.MemberDto;
import com.sh.spring_or_death.regist.model.dto.MemberRegistDto;
import com.sh.spring_or_death.regist.model.service.RegistService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
@RequestMapping("/regist")
@RequiredArgsConstructor
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

    @PostMapping("/regist")
    public String submit(@ModelAttribute MemberRegistDto memberRegistDto, RedirectAttributes redirectAttributes) {
        log.debug("memberDto = {}", memberRegistDto);
        MemberDto memberDto = memberRegistDto.toMemberDto();
        int result = registService.submit(memberDto);
        System.out.println(result);
        redirectAttributes.addFlashAttribute("message", "회원가입이 성공적으로 완료되었습니다!! 👏👏👏");
        return "redirect:/regist/regist";
    }

}
