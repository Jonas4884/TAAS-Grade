package com.example.note_hackathon.Exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class Candidate_Exceptions extends RuntimeException{
    public Candidate_Exceptions(String error){
        super(error);
    }
}
