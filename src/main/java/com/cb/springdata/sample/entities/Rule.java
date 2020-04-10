package com.cb.springdata.sample.entities;

import java.io.Serializable;
import org.springframework.data.couchbase.core.mapping.Document;
import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gopakris
 *
 *         Domain object for Rule
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Rule implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Field
	private Integer id;

	@Field
	private String name;

	@Field
	private String description;

}
