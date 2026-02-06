package com.example.EasyWork.Project.mapper;

import com.example.EasyWork.Project.domain.vo.policy.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PublicDataMapper {
    public void insertToMaster(PolicyMasterVO policyMasterVO);
    public void insertToSupport(PolicySupportVO policySupportVO);
    public void insertToBusinessPeriod(PolicyBusinessPeriodVO policyBusinessPeriodVO);
    public void insertToApplication(PolicyApplicationVO policyApplicationVO);
    public void insertToEligibility(PolicyEligibilityVO policyEligibilityVO);
}
