package io.wandermate.backend.wmbackend.users.repository;

import io.wandermate.backend.wmbackend.users.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, Integer> {
}
