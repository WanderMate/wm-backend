package io.wandermate.backend.wmbackend.api.resources;

import io.wandermate.backend.wmbackend.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UsersController {

    private final UserService userService;

    @GetMapping("/users")
    public String getUsers() {
        return userService.getUsers();
    }
}
