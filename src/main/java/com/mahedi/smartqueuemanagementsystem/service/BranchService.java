package com.mahedi.smartqueuemanagementsystem.service;

import com.mahedi.smartqueuemanagementsystem.dto.BranchDto;
import com.mahedi.smartqueuemanagementsystem.dto.Response;

public interface BranchService {

    Response createBranch(BranchDto branchDto);
}
