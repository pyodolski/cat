package com.example.cat.entity.util.base;

import com.example.cat.entity.entities.UserEntity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class BaseLikeEntity extends DefaultBaseEntity{ // 좋아요 베이스 엔티티
    // UserEntity FK 설정
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_idx")
    private UserEntity userEntity;
}
