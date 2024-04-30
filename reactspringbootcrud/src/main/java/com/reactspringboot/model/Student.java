package com.reactspringboot.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String first_name;


}
