package com.muhammedessa.crudapidata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muhammedessa.crudapidata.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
