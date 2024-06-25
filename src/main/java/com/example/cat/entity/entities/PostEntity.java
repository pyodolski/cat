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
@Table(name = "post_table")
public class PostEntity extends DefaultBaseEntity {

    @Column(length = 50, nullable = false)
    private String title;// 제목
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content; // 내용
    private String latitude; // ..?
    private String longitude; // ..?

    @ManyToOne(fetch = FetchType.LAZY) // 다대일 관계, 엔티티가 필요할 때까지 로딩을 지연
    // 처음에는 userEntity가 로딩되지 않고, 실제로 접근할 때 데이터베이스에서 조회.
    @JoinColumn(name = "user_id")
    // Post 테이블의 user_id 컬럼이 user 테이블의 기본 키를 참조하도록 설정.
    private UserEntity userEntity;
}
