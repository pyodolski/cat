package com.example.cat.entity.entities;

import com.example.cat.entity.util.DefaultListener;
import com.example.cat.entity.util.base.BaseLikeEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@EntityListeners(value = DefaultListener.class)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comment_like")
public class CommentLikeEntity extends BaseLikeEntity {
    // CommentEntity FK 설정
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_idx")
    private CommentEntity commentEntity;
}
