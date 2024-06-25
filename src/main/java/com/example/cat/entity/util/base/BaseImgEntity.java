package com.example.cat.entity.util.base;

import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@SuperBuilder
public abstract class BaseImgEntity extends DefaultBaseEntity {
    protected String path; // 이미지 경로 설정을 위한 추상클래스 생성
}