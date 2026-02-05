package com.example.EasyWork.Project.service;

import com.example.EasyWork.Project.domain.dto.RootDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Slf4j
public class PublicDataService {

    public RootDTO getPublicData() throws  JsonProcessingException {
//        JSON 행정안전부_대한민국 공공서비스(혜택) 정보
        String url = "https://api.odcloud.kr/api/gov24/v3/serviceList"
                +"?page=1"
                +"&perPage=10"
                +"&returnType=json"
                +"&serviceKey=a08f16c3f1fa964e73d7f89c12d0ba23c237661b69c06b2b11143d8451c3a0de";
//       JSON 온통청년 청년정책
        String url2 = "https://www.youthcenter.go.kr/go/ythip/getPlcy"
                    +"?apiKeyNm=33142eb1-009c-4456-bb7d-c7887f95bca8"
                    +"&pageNum=1"
                    +"&pageSize=1"
                    +"&returnType=JSON";

        RestTemplate restTemplate = new RestTemplate();
        String json =  restTemplate.getForObject(url2, String.class);;

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, RootDTO.class);
    }

}
