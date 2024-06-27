package com.example.cat.entity.entities;

import com.example.cat.entity.util.DefaultListener;
import com.example.cat.entity.util.base.DefaultBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity // JPA 엔티티. 데이터베이스 테이블과 매핑
@Data // Getter, Setter, toString 매서드를 자동으로 생성
@SuperBuilder // 상속 관계에서 빌더 패턴을 사용하기 위해 사용 @Builder를 확장한 기능을 제공
@EqualsAndHashCode(callSuper = true) // equals, hashCode 자동 생성, 부모 클래스의 필드도 포함하도록 설정
@ToString(callSuper = true) // toString 자동 생성, 부모 클래스의 필드도 포함하도록 설정
@EntityListeners(value = DefaultListener.class) // Jpa 엔티티의 사용자 정의 엔티티의 생명주기 에벤트를 처리할 리스너 클래스를 지정.
@AllArgsConstructor // 모든 필드를 매개변수로 받는 생성자를 자동으로 생성.
@NoArgsConstructor // 기본 생성자 생성
@Table(name = "user_t") // 엔티티가 매핑될 데이터베이스 테이블의 이름을 지정
public class UserEntity extends DefaultBaseEntity {
    @Column(length = 50, nullable = false) // 50글자 제한, not-null
    private String nick; // 닉네임

    @Column(length = 50, nullable = false, unique = true) // 유일한 값
    private String email; // 이메일

    @Column(length = 100, nullable = false)
    private String password; // 비밀번호
}
