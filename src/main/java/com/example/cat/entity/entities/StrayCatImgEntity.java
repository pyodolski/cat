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
@Table(name = "stray_cat_img_t")
public class StrayCatImgEntity extends BaseImgEntity {
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pet_idx")
    private PetCatEntity petCatEntity;
}
