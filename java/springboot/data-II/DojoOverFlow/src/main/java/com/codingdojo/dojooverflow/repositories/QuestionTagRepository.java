package com.codingdojo.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojooverflow.models.QuestionTag;

@Repository
public interface QuestionTagRepository extends CrudRepository<QuestionTag, Long> {

}
