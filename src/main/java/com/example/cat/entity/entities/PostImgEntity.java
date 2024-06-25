package com.example.cat.entity.entities;

import com.example.cat.entity.util.DefaultListener;
import com.example.cat.entity.util.base.BaseImgEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = false)
@Entity
@EntityListeners(value = DefaultListener.class)
@Data
@SuperBuilder
@ToString(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "post_img_t")
public class PostImgEntity extends BaseImgEntity {

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "post_idx")
    private PostEntity postEntity;

}
