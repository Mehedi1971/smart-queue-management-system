package com.mahedi.smartqueuemanagementsystem.controller;

import com.mahedi.smartqueuemanagementsystem.dto.BranchDto;
import com.mahedi.smartqueuemanagementsystem.dto.Response;
import com.mahedi.smartqueuemanagementsystem.service.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/queue-management/branch")
public class BranchController {
    private final BranchService branchService;

    @PostMapping
    public Response createBranch(@RequestBody BranchDto branchDto){
        return branchService.createBranch(branchDto);
    }
}
