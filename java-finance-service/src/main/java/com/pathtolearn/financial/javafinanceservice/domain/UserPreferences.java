package com.pathtolearn.financial.javafinanceservice.domain;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "user_preferences")
public class UserPreferences {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne(optional = false)
    @JoinColumn(name = "user_id", unique = true)
    private User user;

    private Boolean notificationOptIn = Boolean.FALSE;

    private String timeZone;

    private String locale;

    // getters/setters or Lombok
}
