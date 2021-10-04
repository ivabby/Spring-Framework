package com.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection jdbc;

	public ComponentJdbcConnection getJdbc() {
		return jdbc;
	}

	public void setJdbc(ComponentJdbcConnection jdbc) {
		this.jdbc = jdbc;
	}

}
