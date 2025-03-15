package com.mahedi.smartqueuemanagementsystem.dto;

import com.mahedi.smartqueuemanagementsystem.model.BaseEntity;
import com.mahedi.smartqueuemanagementsystem.model.Branch;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagerProfileDto extends BaseDto {
    private BranchDto branchDto;
}
