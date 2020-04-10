package com.cb.springdata.sample.repositories;

import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cb.springdata.sample.entities.Rule;

/**
 * @author gopakris
 *
 *         {@link Repository} for Rule Object
 */
@ViewIndexed(designDoc = "rule")
public interface RuleRepository extends CouchbasePagingAndSortingRepository<Rule, Integer> {


}
