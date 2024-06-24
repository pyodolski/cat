package com.example.cat.entity.util;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

public class DefaultListener {
    // Jpa 엔티티 리스너 클래스로, 엔티티의 생명주기 에벤트에 대한 콜백 메서드를 정의
    @PrePersist // 엔티티가 영속화되기 전에 실행되는 메서드에 적용. 엔티티가 저장되기 전 호출
    // 영속 : 엔티티 매니저에 의해 관리되는 상택
    public void prePersist(Object o) {
        if (o instanceof IEntityAdapter) {
            ((IEntityAdapter) o).setCreateAt(LocalDateTime.now());
            ((IEntityAdapter) o).setUpdateAt(LocalDateTime.now());
        } // 즉, 엔티티가 저장되기 전에 생성 시간과 수정시간을 현재 시간으로 설정.
    }

    @PreUpdate // 엔티티가 업데이트되기 전에 실행되는 메서드에 적용.
    public void preUpdate(Object o) {
        if (o instanceof IEntityAdapter) {
            ((IEntityAdapter) o).setUpdateAt(LocalDateTime.now());
        }
    }
}
