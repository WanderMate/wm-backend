package io.wandermate.backend.wmbackend.users.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="users", schema="wandermate")
@ToString
public class Users {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="username")
    @Getter
    @Setter
    private String username;

    @Column(name="password")
    @Getter
    @Setter
    private String password;

    @Column(name="email")
    @Getter
    @Setter
    private String email;
}
