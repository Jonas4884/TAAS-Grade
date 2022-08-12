package com.example.note_hackathon.repository;

import com.example.note_hackathon.model.candidate;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface candidate_repository extends JpaRepository<candidate,Integer> {

    candidate findcandidateBynote(float note);
}
