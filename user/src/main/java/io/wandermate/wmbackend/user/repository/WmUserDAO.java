package io.wandermate.wmbackend.user.repository;

import io.wandermate.wmbackend.user.entity.WmUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WmUserDAO extends JpaRepository<WmUser, Integer> {
}
