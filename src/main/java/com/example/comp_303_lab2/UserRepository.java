package com.example.comp_303_lab2;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Student, Integer> {
}