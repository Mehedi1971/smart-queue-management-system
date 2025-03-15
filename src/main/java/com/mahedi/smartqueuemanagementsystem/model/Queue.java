package com.mahedi.smartqueuemanagementsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Queue extends BaseEntity{
    private String name;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    private Integer maxCapacity;
    private Integer currentQueueNumber;

    private boolean allowOnlineBooking;

    private Integer avgWaitTime;

    @OneToMany(mappedBy = "queue")
    private List<QueueEntry> queueEntryList;
}
