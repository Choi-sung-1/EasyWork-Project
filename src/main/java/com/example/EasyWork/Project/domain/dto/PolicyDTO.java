package com.example.EasyWork.Project.domain.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class PolicyDTO {

    @JsonProperty("plcyNo")
    private String policyId;
    @JsonProperty("plcyNm")
    private String policyName;
    @JsonProperty("plcyKywdNm")
    private String keyword;
    @JsonProperty("plcyExplnCn")
    private String description;
    @JsonProperty("lclsfNm")
    private String mainCategory;
    @JsonProperty("mclsfNm")
    private String subCategory;
}
