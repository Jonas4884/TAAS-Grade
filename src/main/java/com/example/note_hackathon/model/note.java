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
public class note {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id_note;
        private int id_student;
        private int id_math;
        private int id_french;
}
