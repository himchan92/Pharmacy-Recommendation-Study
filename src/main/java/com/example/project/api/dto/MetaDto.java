package com.example.project.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MetaDto {

    @JsonProperty("total_count") //json 응답받을 시 받을 값 설정(api 문서에 명시된 필드명과 매핑되게 일치)
    private Integer totalCount;
}
