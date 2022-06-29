package me.thisisalexis.iam.controller;

import lombok.extern.slf4j.Slf4j;
import me.thisisalexis.iam.dto.UserRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
//TODO Add Swagger documentation
//TODO Add security
public class UserController {

    //TODO Delete this
    private static final UserRecord mockUser() {
        return new UserRecord("thisisalexis", "Alexis", "Bravo", "alexis.ve@gmail.com", LocalDate.now(), LocalDateTime.now(), LocalDateTime.now());
    }

    @GetMapping
    public ResponseEntity<?> getUsers() {
        log.info("Querying all users");
        return ResponseEntity.ok(List.of(mockUser()));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUser(@PathVariable String userId) {
        log.info("Querying user {}", userId);
        return ResponseEntity.ok(mockUser());
    }

}
