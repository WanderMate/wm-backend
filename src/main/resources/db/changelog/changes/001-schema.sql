--liquibase formatted sql
--changeset solarsan:001-schema

CREATE SCHEMA IF NOT EXISTS wandermate;

CREATE TABLE IF NOT EXISTS wandermate.users
(
    id       uuid PRIMARY KEY,
    username varchar NOT NULL UNIQUE,
    email    varchar NOT NULL UNIQUE,
    password varchar NOT NULL
);