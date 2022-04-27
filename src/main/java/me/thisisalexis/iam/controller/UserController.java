package me.thisisalexis.iam.controller;

import me.thisisalexis.iam.dto.UserRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<?> getUsers() {
        final UserRecord userRecord = new UserRecord("thisisalexis", "Alexis","Bravo", "alexis.ve@gmail.com", LocalDate.now(), LocalDateTime.now(), LocalDateTime.now());
        return ResponseEntity.of(Optional.of(userRecord));
    }

}
