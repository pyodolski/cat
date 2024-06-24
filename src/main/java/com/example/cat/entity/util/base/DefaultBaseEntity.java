package com.example.cat.entity.util.base;

import com.example.cat.entity.util.IEntityAdapter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter // 모든 필드에 대한 setter 메서드를 자동으로 생성.
@Getter // 모든 필드에 대한 getter 메서드를 자동으로 생성.
@AllArgsConstructor // 모든 필드를 매개변수로 받는 생성자를 자동으로 생성.
@NoArgsConstructor // 매개변수가 없는 기본 생성자를 자동으로 생성.
@MappedSuperclass // 이 클래스를 상속받는 엔티티 클래스는 이클래스의 매핑 정보를 공유.
@SuperBuilder // 하위 클래스에서 빌더 패턴을 사용할 수 있게 함.
public class DefaultBaseEntity implements IEntityAdapter<LocalDateTime> {
    // 엔티티 베이스
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    protected long idx; // 엔티티의 기본 키 @Id로 식별자로 지정, @GeneratedValue로 자동 증가.
    protected LocalDateTime createAt; // 엔티티의 생성 시간.
    protected LocalDateTime updateAt; // 엔티티의 수정 시간.
}
