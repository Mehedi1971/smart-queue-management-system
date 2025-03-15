package com.mahedi.smartqueuemanagementsystem.dto;

import com.mahedi.smartqueuemanagementsystem.model.Branch;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueueDto extends BaseDto {
    private String name;

    private BranchDto branchDto;

    private Integer maxCapacity;
    private Integer currentQueueNumber;

    private boolean allowOnlineBooking;

    private Integer avgWaitTime;

    private List<QueueEntryDto> queueEntryDtoList;
}
