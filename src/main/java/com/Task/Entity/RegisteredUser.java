package com.Task.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "registered_users")
public class RegisteredUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String email;
    private String password;
}
