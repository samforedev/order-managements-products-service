package com.metacho.ordermanagementsproductsservice.core.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public abstract class BaseEntity {
    @Id
    @Field(targetType = FieldType.STRING)
    private UUID id;
    @Field(targetType = FieldType.STRING)
    private UUID version;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @Builder.Default
    private StatusEntity status = StatusEntity.ACTIVE;
    @Builder.Default
    private boolean deleted = false;
}
