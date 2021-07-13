package com.codingdojo.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojooverflow.models.Answer;
import com.codingdojo.dojooverflow.models.Question;
import com.codingdojo.dojooverflow.models.QuestionTag;
import com.codingdojo.dojooverflow.models.Tag;
import com.codingdojo.dojooverflow.repositories.AnswerRepository;
import com.codingdojo.dojooverflow.repositories.QuestionRepository;
import com.codingdojo.dojooverflow.repositories.QuestionTagRepository;
import com.codingdojo.dojooverflow.repositories.TagRepository;

@Service
public class MainService {
	private final AnswerRepository ansRepo;
	private final QuestionRepository queRepo;
	private final TagRepository tagRepo;
	private final QuestionTagRepository queTagRepo;
	
	public MainService(AnswerRepository ansRepo, QuestionRepository queRepo,
			TagRepository tagRepo, QuestionTagRepository queTagRepo) {
		this.ansRepo = ansRepo;
		this.queRepo = queRepo;
		this.tagRepo = tagRepo;
		this.queTagRepo = queTagRepo;
	}
	
	public List<Question> allQuestions() {
		return queRepo.findAll();
	}
	
	public List<Answer> allAnswers() {
		return ansRepo.findAll();
	}
	
	public Question findQuestion(Long id) {
		Optional<Question> question = queRepo.findById(id);
		if(question.isPresent()) return question.get();
		else return null;
	}
	
	public Answer createAnswer(Answer answer) {
		return ansRepo.save(answer);
	}
	
	public Question createQuestionWithTags(Question question, String tags) {	
		String[] arrTags = tags.split(",");
		List<Tag> tagsList = new ArrayList<>();
		
		for(int i = 0; i < arrTags.length; i++) {
			String temporalTag = arrTags[i].trim().toLowerCase();
			Tag tag = tagRepo.findBySubject(temporalTag);
			if(tag == null) tag = createTag(new Tag(temporalTag));
			tagsList.add(tag);		
		}
		question.setTags(tagsList);
		return queRepo.save(question);
	}
	
	public Question createQuestion(Question question) {
		return queRepo.save(question);
	}
	
	public Tag createTag(Tag tag) {
		return tagRepo.save(tag);
	}
	
	public QuestionTag createQuestionTag(QuestionTag questionTag) {
		return queTagRepo.save(questionTag);
	}
}
