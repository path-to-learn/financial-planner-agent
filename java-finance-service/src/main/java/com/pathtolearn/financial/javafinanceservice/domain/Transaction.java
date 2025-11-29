package com.pathtolearn.financial.javafinanceservice.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Type type;

    private LocalDate date;

    private String tags; // simple string for now; can be JSON later

    public enum Type {
        SAVINGS,
        EXPENSE,
        INVESTMENT
    }

    // getters/setters or Lombok
}
