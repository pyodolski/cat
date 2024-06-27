package com.example.cat.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {
    @JsonProperty("user_idx")
    // JSON 직렬화 및 역직렬화 과정에서 해당 필드가 어떤 JSON 속성과 매핑될지를 지정하는 데 사용
    private long userIdx;
    @JsonProperty("post_idx")
    private long postIdx;
    private String content;
    @JsonProperty("like_count")
    @Builder.Default
    private int likeCount=0;
}