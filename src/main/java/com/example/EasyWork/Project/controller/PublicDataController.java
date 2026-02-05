package com.example.EasyWork.Project.controller;

import com.example.EasyWork.Project.domain.dto.PolicyDTO;
import com.example.EasyWork.Project.domain.dto.RootDTO;
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

        RootDTO root = publicDataService.getPublicData();

        return root.getResult().getPolicyList();
    }
}
