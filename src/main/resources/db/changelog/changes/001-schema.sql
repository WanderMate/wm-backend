--liquibase formatted sql
--changeset solarsan:001-schema

CREATE SCHEMA IF NOT EXISTS wandermate;

CREATE TABLE IF NOT EXISTS wandermate.users
(
    id       serial PRIMARY KEY,
    username varchar NOT NULL UNIQUE,
    email    varchar NOT NULL UNIQUE,
    password varchar NOT NULL
);

INSERT INTO wandermate.users (username, email, password)
VALUES ('shivang16', 'shivangmangal@gmail.com', 'password'),
       ('ashutosh', 'ashu@gmail.com', 'password1'),
       ('shobhit', 'shobhit@gmail.com', 'password2'),
       ('mjay', 'mjay@gmail.com', 'password3');