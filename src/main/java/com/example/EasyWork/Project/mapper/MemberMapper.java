package com.example.EasyWork.Project.mapper;

import com.example.EasyWork.Project.domain.dto.member.LoginDTO;
import com.example.EasyWork.Project.domain.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    public void insertMember(MemberVO memberVO);

    public LoginDTO selectPwdByLoginId(String loginId);
}
