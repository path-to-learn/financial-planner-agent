package com.pathtolearn.financial.javafinanceservice.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "goals")
public class Goal {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    private String name;

    @Column(precision = 19, scale = 2)
    private BigDecimal targetAmount;

    private LocalDate targetDate;

    private Integer priority; // 1-5 maybe

    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;

    private Instant createdAt = Instant.now();

    public enum Status {
        ACTIVE,
        ACHIEVED,
        CANCELLED
    }

    // getters/setters or Lombok
}
