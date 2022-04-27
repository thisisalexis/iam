package me.thisisalexis.iam.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record UserRecord(String username, String firstname, String lastname, String email, LocalDate birthdate, LocalDateTime createdAt, LocalDateTime updatedAt) {

}
