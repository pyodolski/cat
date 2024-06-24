package com.example.cat.entity.util;

public interface IEntityAdapter<T> {
    void setCreateAt(T o);
    // 엔터티 객체 o의 생성 시점을 설정하는 데 사용.
    // 매개변수 o는 생성 시간을 설정해야 하는 엔터티 객체.
    // 데이터베이스에 새 레코드를 삽입할 때 해당 엔터티 객체의 생성 시간을 기록할 수 있음.
    void setUpdateAt(T o);
    // 엔터티 객체 o의 수정 시점을 설정하는 데 사용.
    // 매개변수 o는 수정 시간을 설정해야 하는 엔터티 객체.
    // 데이터베이스에서 레코드를 수정할 때 해단 엔터티 객체의 수정 시간을 기록.
}
