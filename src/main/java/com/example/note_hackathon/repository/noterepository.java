package com.example.note_hackathon.repository;

import com.example.note_hackathon.model.grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface noterepository extends JpaRepository<grade,Integer> {
}
