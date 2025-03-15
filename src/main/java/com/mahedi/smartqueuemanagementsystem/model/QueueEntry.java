package com.mahedi.smartqueuemanagementsystem.model;

import com.mahedi.smartqueuemanagementsystem.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueueEntry extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "queue_id")
    private Queue queue;

    private Integer position;
    private LocalDateTime joinAt;

    private Status status;
    private boolean notified;
    private boolean inOnline;
}
