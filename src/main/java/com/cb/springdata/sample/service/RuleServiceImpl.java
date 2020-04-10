package com.cb.springdata.sample.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cb.springdata.sample.entities.Rule;
import com.cb.springdata.sample.repositories.RuleRepository;

/**
 * @author gopakris
 * 
 *         Service Implementation for Rule
 */
@Service
public class RuleServiceImpl implements RuleService {

	@Autowired
	private RuleRepository ruleRepository;

	@Override
	public Optional<Rule> getRule(Integer id) {
		return ruleRepository.findById(id);
	}
}
