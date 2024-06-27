package com.example.cat.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CatDto {
    private String name;
    private String des;
    private Long userId;
    @Builder.Default
    private List<String> catImgList = new ArrayList<>();
}