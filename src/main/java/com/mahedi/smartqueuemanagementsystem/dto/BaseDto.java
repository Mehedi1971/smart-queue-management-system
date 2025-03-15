package com.mahedi.smartqueuemanagementsystem.dto;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseDto {
    private Long id;
    private UUID uuid;
    private String createdBy;

    private LocalDateTime createdAt;

    private String updatedBy;
    private LocalDateTime updatedAt;
    private Integer activeStatus;
}
