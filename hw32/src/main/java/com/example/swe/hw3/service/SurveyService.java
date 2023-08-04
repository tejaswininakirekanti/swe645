package com.example.swe.hw3.service;

import java.util.*;

import com.example.swe.hw3.model.Survey;

public interface SurveyService {
	Survey saveSurvey(Survey survey);
	List<Survey> getAllSurveys();
	Survey getSurveyById(long id);
	Survey updateSurvey(Survey survey,long id);
	void deleteSurvey(long id);
}
