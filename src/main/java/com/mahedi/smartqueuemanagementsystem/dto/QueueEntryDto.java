package com.mahedi.smartqueuemanagementsystem.dto;

import com.mahedi.smartqueuemanagementsystem.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueueEntryDto extends BaseDto {


    private QueueDto queueDto;

    private Integer position;
    private LocalDateTime joinAt;

    private Status status;
    private boolean notified;
    private boolean inOnline;
}
