package com.example.swe.hw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.swe.hw3.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long> {

}
