package com.mahedi.smartqueuemanagementsystem.dto;

import com.mahedi.smartqueuemanagementsystem.enums.IndustryType;
import com.mahedi.smartqueuemanagementsystem.model.ManagerProfile;
import com.mahedi.smartqueuemanagementsystem.model.Queue;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchDto extends BaseDto {
    private String branchName;
    private String location;
    private IndustryType industryType;

    private List<QueueDto> queueList;

    private List<ManagerProfileDto> managerProfileList;
}
