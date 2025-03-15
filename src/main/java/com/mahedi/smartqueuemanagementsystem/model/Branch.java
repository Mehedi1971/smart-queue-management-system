package com.mahedi.smartqueuemanagementsystem.model;

import com.mahedi.smartqueuemanagementsystem.enums.IndustryType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Branch extends BaseEntity {
    private String branchName;
    private String location;
    private IndustryType industryType;

    @OneToMany(mappedBy = "branch")
    private List<Queue> queueList;

    @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY)
    private List<ManagerProfile> managerProfileList;
}
