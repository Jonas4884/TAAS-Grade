package com.example.note_hackathon.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "grade_math")
public class grade_math {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_math;
    private float note_bacc;
    private float note_concours;
}
