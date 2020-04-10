package com.cb.springdata.sample.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import com.cb.springdata.sample.entities.Rule;

/**
 * @author gopakris
 *
 *         Rule Interface
 */
public interface RuleService {

	Optional<Rule> getRule(Integer id);

}
