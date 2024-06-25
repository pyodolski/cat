package com.example.cat.entity.entities;

import com.example.cat.entity.util.DefaultListener;
import com.example.cat.entity.util.base.DefaultBaseEntity;
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
@Table(name = "tag_t")
public class TagEntity extends DefaultBaseEntity {
    private String keyword;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "post_idx")
    private PostEntity postEntity;
}
