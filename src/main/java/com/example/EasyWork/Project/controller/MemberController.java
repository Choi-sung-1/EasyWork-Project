package com.example.EasyWork.Project.controller;

import com.example.EasyWork.Project.domain.dto.member.LoginDTO;
import com.example.EasyWork.Project.domain.vo.MemberVO;
import com.example.EasyWork.Project.service.member.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/join")
    public String join() {

        return "member/join";
    }

    @PostMapping("/join")
    public String join(@ModelAttribute MemberVO memberVO, Model model){

        memberService.insert(memberVO);

        model.addAttribute("member", memberVO);

        return "member/memberDetail";
    }

    @GetMapping("/login")
    public String login(){
        return "member/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute LoginDTO loginDTO, HttpSession session){

        if(memberService.logincheck(loginDTO)){
            session.setAttribute("id", loginDTO.getId());
            log.info("id{}",session.getAttribute("id") );
            return "redirect:/";
        }
        return  "member/login";
    }
}
