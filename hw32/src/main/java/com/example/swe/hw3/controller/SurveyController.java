package com.example.swe.hw3.controller;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http. ResponseEntity;
import org.springframework.web.bind.annotation. DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation. PutMapping;
import org.springframework.web.bind.annotation. RequestBody;
import org.springframework.web.bind.annotation. RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation. RestController;
import org.springframework.stereotype.Controller;

import com.example.swe.hw3.model.Survey;
import com.example.swe.hw3.service.SurveyService;


@RestController
@Controller
@RequestMapping("/api/surveys")
public class SurveyController {

	private SurveyService surveyService;
	public SurveyController(SurveyService surveyService) {
		super();
		this.surveyService = surveyService;
	}
	@PostMapping
	public ResponseEntity<Survey> saveSurvey(@RequestBody Survey survey){
		return new ResponseEntity<Survey>(surveyService.saveSurvey(survey), HttpStatus.CREATED);
		
	}
	@GetMapping
	public List<Survey> getAllSurveys(){
		return surveyService.getAllSurveys();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Survey> getSurveyById(@PathVariable("id") long surveyId){
		return new ResponseEntity<Survey>(surveyService.getSurveyById(surveyId), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Survey> updateSurvey(@PathVariable("id") long surveyId, @RequestBody Survey survey){
		return new ResponseEntity<Survey>(surveyService.updateSurvey(survey,surveyId), HttpStatus.OK);
	}
	
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteSurvey(@PathVariable("id") long surveyId){
		surveyService.deleteSurvey(surveyId);
		
	return new ResponseEntity<String> ("Survey deleted successfully.", HttpStatus.OK);
	}
	
	
//	@PostMapping("/submit-form")
//    public String handleFormSubmission(@RequestParam String name, @RequestParam String email) {
//        // Process the form data here (e.g., save to a database)
//        // For this example, we'll just print the data
//        System.out.println("Name: " + name);
//        System.out.println("Email: " + email);
//        System.out.print("dbdwj");
//
//        // Return the name of the view (HTML page) to display after form submission
//        return "success";
//    }
}
