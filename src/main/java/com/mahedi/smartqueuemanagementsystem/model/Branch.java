package com.mahedi.smartqueuemanagementsystem.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Branch extends BaseEntity {
    private String branchName;
    private String location;
}
