package com.example.EasyWork.Project.service.member;

import com.example.EasyWork.Project.domain.dto.member.LoginDTO;
import com.example.EasyWork.Project.domain.vo.MemberVO;
import org.springframework.stereotype.Service;


public interface MemberService {
    public void insert(MemberVO memberVO);
    public boolean logincheck(LoginDTO loginDTO);
}
