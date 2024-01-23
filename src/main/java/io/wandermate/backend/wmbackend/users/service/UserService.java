package io.wandermate.backend.wmbackend.users.service;

import io.wandermate.backend.wmbackend.users.repository.UsersRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UsersRepo usersRepo;

    public String getUsers() {
        return usersRepo.findAll().toString();
    }
}
