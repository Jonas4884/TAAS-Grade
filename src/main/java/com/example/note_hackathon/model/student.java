package com.example.note_hackathon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_student;
    @Column(length = 150)
    private String first_name;
    @Column(length = 150)
    private String last_name;
}
