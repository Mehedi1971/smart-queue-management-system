package com.mahedi.smartqueuemanagementsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagerProfile extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;
}
