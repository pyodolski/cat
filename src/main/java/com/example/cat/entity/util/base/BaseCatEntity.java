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
public abstract class BaseCatEntity extends DefaultBaseEntity {
    private String name;
    private String des;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_idx")
    private UserEntity userEntity;
}
