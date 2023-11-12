# create database if not exists "punchedbackend" default character set utf8mb4 collate utf8mb4_unicode_ci;


drop table if exists `tb_user_info`;
create table `tb_user_info` (
                                id      VARCHAR(60),
                                text    VARCHAR(255)      NOT NULL
) engine=InnoDB default charset=utf8mb4 collate=utf8mb4_unicode_ci;

