package com.example.note_hackathon.controller;

import com.example.note_hackathon.Exceptions.Candidate_Exceptions;
import com.example.note_hackathon.model.candidate;
import com.example.note_hackathon.repository.candidate_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/candidate")

public class candidate_controller {

    @Autowired
    private candidate_repository Candidate_Repository;

    @GetMapping("/all")
    public List<candidate> getAll(){
        return this.Candidate_Repository.findAll();
    }

    @GetMapping("/all/{id}")
    public candidate getCandidateById(@PathVariable(value = "id") Integer id){
        return this.Candidate_Repository.findById(id).orElseThrow(()-> new Candidate_Exceptions("Candidate not submited"));
    }

    @GetMapping("/candidate/note={note}")
    public candidate getCandidateByNote(@PathVariable(value = "note") float note){
        return this.Candidate_Repository.findcandidateBynote(note);
    }
    
}
