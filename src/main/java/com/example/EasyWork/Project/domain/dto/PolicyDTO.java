package com.example.EasyWork.Project.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PolicyDTO {
    //    정책명
    String plcyNm;
    //    정책 키워드
    String plcyKywdNm;
    //    정책설명 내용
    String plcyExplnCn;

}
