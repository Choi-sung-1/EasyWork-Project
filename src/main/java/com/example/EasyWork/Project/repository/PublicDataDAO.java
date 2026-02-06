package com.example.EasyWork.Project.repository;

import com.example.EasyWork.Project.domain.vo.policy.*;
import com.example.EasyWork.Project.mapper.PublicDataMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PublicDataDAO {
    private final PublicDataMapper publicDataMapper;

    public void insertToMaster(PolicyMasterVO policyMasterVO){
        publicDataMapper.insertToMaster(policyMasterVO);
    }
    public void insertToSupport(PolicySupportVO policySupportVO){
        publicDataMapper.insertToSupport(policySupportVO);
    }
    public void insertToBusinessPeriod(PolicyBusinessPeriodVO policyBusinessPeriodVO){
        publicDataMapper.insertToBusinessPeriod(policyBusinessPeriodVO);
    }
    public void insertToApplication(PolicyApplicationVO policyApplicationVO){
        publicDataMapper.insertToApplication(policyApplicationVO);
    }
    public void insertToEligibility(PolicyEligibilityVO policyEligibilityVO){
        publicDataMapper.insertToEligibility(policyEligibilityVO);
    }


}
