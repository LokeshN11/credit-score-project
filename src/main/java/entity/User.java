package com.lokesh.creditscore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int creditScore;

    public User() {
    }

    public User(String name, int creditScore) {
        this.name = name;
        this.creditScore = creditScore;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}