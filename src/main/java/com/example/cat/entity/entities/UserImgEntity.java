package com.example.cat.entity.entities;

import com.example.cat.entity.util.DefaultListener;
import com.example.cat.entity.util.base.BaseImgEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Entity
@EntityListeners(value = DefaultListener.class)
@Data
@SuperBuilder
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_img_t")
public class UserImgEntity extends BaseImgEntity {

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    // 케스케이드 옵션은 엔티티의 상태 변화가 연관된 엔티티에 어떻게 전파되는지 결정
    // 부모 엔티티가 영속화(Persist)될 때, 연관된 자식 엔티티도 자동으로 영속화되도록 설정.
    @JoinColumn(name = "user_idx")
    private UserEntity userEntity;

}