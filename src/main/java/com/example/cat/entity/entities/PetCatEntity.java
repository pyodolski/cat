package com.example.cat.entity.entities;

import com.example.cat.entity.util.DefaultListener;
import com.example.cat.entity.util.base.BaseCatEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@Entity
@EntityListeners(value = DefaultListener.class)
@Table(name = "pet_cat_t")
public class PetCatEntity extends BaseCatEntity {
}
