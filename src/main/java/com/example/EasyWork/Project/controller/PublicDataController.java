package com.example.EasyWork.Project.controller;

import com.example.EasyWork.Project.domain.dto.PolicyDTO;
import com.example.EasyWork.Project.service.PublicDataService;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class PublicDataController {
    private final PublicDataService publicDataService;

    @GetMapping("/api/welfare")
    public List<PolicyDTO> getData() throws Exception {

        JsonNode listNode = publicDataService.getPublicData();

        if (listNode.isMissingNode() || !listNode.isArray() || listNode.size() == 0) {
            log.error("youthPolicyList가 비었거나 배열이 아님");
            return null;
        }
        List<PolicyDTO> dtoList = new ArrayList<>();
        for (int i = 0; i < listNode.size(); i++) {
            JsonNode policyNode = listNode.get(i);
            PolicyDTO dto = new PolicyDTO();
            dto.setPlcyNm(policyNode.path("plcyNm").asText());
            dto.setPlcyKywdNm(policyNode.path("plcyKywdNm").asText());
            dto.setPlcyExplnCn(policyNode.path("plcyExplnCn").asText());
            dtoList.add(dto);
        }
        return dtoList;
    }
}
