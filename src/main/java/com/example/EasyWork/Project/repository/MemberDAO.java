package com.example.EasyWork.Project.repository;

import com.example.EasyWork.Project.domain.dto.member.LoginDTO;
import com.example.EasyWork.Project.domain.vo.MemberVO;
import com.example.EasyWork.Project.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberDAO {

    private final MemberMapper memberMapper;

    public void insert(MemberVO memberVO){
        memberMapper.insertMember(memberVO);
    }

    public LoginDTO selectPwdByLoginId(String loginId){
        return memberMapper.selectPwdByLoginId(loginId);
    }


}
