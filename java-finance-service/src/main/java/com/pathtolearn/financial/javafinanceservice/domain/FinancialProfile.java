package com.pathtolearn.financial.javafinanceservice.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "financial_profile")
public class FinancialProfile {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    private BigDecimal monthlyIncome;
    private BigDecimal avgMonthlySaving;

    @Enumerated(EnumType.STRING)
    private RiskProfile riskProfile;

    private String currency;

    public enum RiskProfile {
        CONSERVATIVE,
        BALANCED,
        AGGRESSIVE
    }

    // getters/setters or Lombok
}
