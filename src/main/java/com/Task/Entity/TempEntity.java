package com.Task.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "temp")
public class TempEntity {
    @Id
    private String email;

    private String otp;

}
