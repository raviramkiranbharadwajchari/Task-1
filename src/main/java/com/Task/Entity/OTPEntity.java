package com.Task.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "otp")
public class OTPEntity {
    @Id
    private String email;

    private String otp;

    private LocalDateTime expiryTime;

}
