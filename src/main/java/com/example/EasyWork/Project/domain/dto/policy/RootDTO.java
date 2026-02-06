package com.example.EasyWork.Project.domain.dto.policy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

//사용안하는 필드 무시하기

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class RootDTO {

    @JsonProperty("result")
    private ResultDTO result;
}

