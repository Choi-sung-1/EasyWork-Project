package com.example.EasyWork.Project.service.member;

import com.example.EasyWork.Project.domain.dto.member.LoginDTO;
import com.example.EasyWork.Project.domain.vo.MemberVO;
import com.example.EasyWork.Project.repository.MemberDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberDAO memberDAO;

    @Override
    public void insert(MemberVO memberVO) {
        memberDAO.insert(memberVO);
    }

    @Override
    public boolean logincheck(LoginDTO loginDTO) {
        LoginDTO newLoginDTO = memberDAO.selectPwdByLoginId(loginDTO.getLoginId());
        if(newLoginDTO.getPwd().equals(loginDTO.getPwd())){
            loginDTO.setId(newLoginDTO.getId());
            loginDTO.setPwd(newLoginDTO.getPwd());
            return true;
        }
        return false;
    }
}
