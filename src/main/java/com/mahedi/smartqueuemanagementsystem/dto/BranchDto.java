package com.mahedi.smartqueuemanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchDto extends BaseDto {
    private String branchName;
    private String location;
}
