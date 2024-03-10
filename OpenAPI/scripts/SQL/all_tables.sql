# create database if not exists "punchedbackend" default character set utf8mb4 collate utf8mb4_unicode_ci;


drop table if exists `tb_user_info`;
create table `tb_user_info` (
    uid VARCHAR(36),
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    phone VARCHAR(255),
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (uid)
) engine=InnoDB default charset=utf8mb4 collate=utf8mb4_unicode_ci;

