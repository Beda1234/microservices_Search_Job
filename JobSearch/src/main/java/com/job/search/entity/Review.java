package com.job.search.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private double rating;
    @ManyToOne
    @JsonIgnore
    private Company company;
}
