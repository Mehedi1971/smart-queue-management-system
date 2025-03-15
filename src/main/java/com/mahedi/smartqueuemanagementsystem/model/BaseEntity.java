package com.mahedi.smartqueuemanagementsystem.model;

import com.mahedi.smartqueuemanagementsystem.enums.ActiveStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID uuid;
    private String createdBy;

    private LocalDateTime createdAt;

    private String updatedBy;
    private LocalDateTime updatedAt;
    private Integer activeStatus;

    @PrePersist
    public void setPreInsertData() {
        this.createdAt= LocalDateTime.now();
        if(this.activeStatus==null){
            this.activeStatus = ActiveStatus.ACTIVE.getValue();
        }
    }
    @PreUpdate
    public void setPreUpdateData(){
        this.updatedAt=LocalDateTime.now();
    }
}
