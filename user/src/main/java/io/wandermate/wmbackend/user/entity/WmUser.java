package io.wandermate.wmbackend.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wm_user")
@Getter
@Setter
@Builder
public class WmUser {
    @Id
    @Column(name = "wm_user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer wmUserId;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;
}
