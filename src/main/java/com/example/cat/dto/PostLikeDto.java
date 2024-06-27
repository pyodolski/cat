package com.example.cat.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Getter, Setter, ToString, equals, hashCode
@Builder // 빌더 패턴을 적용, 객체를 보다 유연하게 생성 가능. ex) PostLikeDto.builder().userIdx(1).postIdx(1).build();
@AllArgsConstructor // new PostLikeDto(1, 1)
@NoArgsConstructor // new PostLikeDto()
public class PostLikeDto {
    @JsonProperty("user_idx") // {"user_idx": 1, "post_idx": 1} -> user_idx: 1, post_idx: 1 로 매핑
    long userIdx;
    @JsonProperty("post_idx")
    long postIdx;
}
