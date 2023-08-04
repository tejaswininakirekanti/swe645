package com.example.swe.hw3.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.swe.hw3.model.Survey;
import com.example.swe.hw3.repository.SurveyRepository;
import com.example.swe.hw3.service.SurveyService;


@Service
public class SurveyServiceImpl implements SurveyService {
	
	public SurveyRepository surveyRepository;
	
	public SurveyServiceImpl(SurveyRepository surveyRepository) {
		super();
		this.surveyRepository = surveyRepository;
	}

	@Override
	public Survey saveSurvey(Survey survey) {
		// TODO Auto-generated method stub
		return surveyRepository.save(survey);
	}

	@Override
	public List<Survey> getAllSurveys() {
		// TODO Auto-generated method stub
		return surveyRepository.findAll();
	}

	@Override
	public Survey getSurveyById(long id) {
		// TODO Auto-generated method stub
		Optional<Survey> survey = surveyRepository.findById(id);
		
		if(survey.isPresent()) {
			return survey.get();
		}
		else {
			return null;
		}
//		return null;
	}

	@Override
	public Survey updateSurvey(Survey survey, long id) {
		// TODO Auto-generated method stub
		Optional<Survey> existingSurveyOptional = surveyRepository.findById(id);
        if (existingSurveyOptional.isPresent()) {
            Survey existingSurvey = existingSurveyOptional.get();
            
            existingSurvey.setFirst_name(survey.getFirst_name());
            existingSurvey.setLast_name(survey.getLast_name());
            existingSurvey.setStreet_address(survey.getStreet_address());
            existingSurvey.setCity(survey.getCity());
            existingSurvey.setState(survey.getState());
            existingSurvey.setZip(survey.getZip());
            existingSurvey.setTelephone_number(survey.getTelephone_number());
            existingSurvey.setEmail(survey.getEmail());
            existingSurvey.setDos(survey.getDos());
            existingSurvey.setMostLiked(survey.getMostLiked());
            existingSurvey.setInterestUniv(survey.getInterestUniv());
            existingSurvey.setLikelyRecommend(survey.getLikelyRecommend());
            existingSurvey.setComments(survey.getComments());

            return surveyRepository.save(existingSurvey);
        } else {
            return null;
        }
	}

	@Override
	public void deleteSurvey(long id) {
		// TODO Auto-generated method stub
		Optional<Survey> surveyOptional = surveyRepository.findById(id);
	    if (surveyOptional.isPresent()) {
	        surveyRepository.deleteById(id);
	    } else {
	        
	        System.out.println("Survey with ID " + id + " not found. Cannot delete.");
	    }
	}

}
