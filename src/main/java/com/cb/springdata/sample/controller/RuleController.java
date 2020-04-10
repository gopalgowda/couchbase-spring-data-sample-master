package com.cb.springdata.sample.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cb.springdata.sample.entities.Rule;
import com.cb.springdata.sample.service.RuleService;

/**
 * @author gopakris
 * 
 *         Controller for Rule object
 *
 */
/**
 * @author gopakris
 *
 */
@RestController
public class RuleController {

	@Autowired
	private RuleService ruleService;

	/**
	 * @param id
	 * @return Optiona<Rule>
	 */
	@GetMapping(path = "/rule/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Rule> getRule(@PathVariable("id") Integer id) {
		return ruleService.getRule(id);

	}

}
