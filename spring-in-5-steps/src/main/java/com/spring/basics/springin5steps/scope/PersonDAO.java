package com.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
	@Autowired
	JdbcConnection jdbc;

	public JdbcConnection getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcConnection jdbc) {
		this.jdbc = jdbc;
	}

}
