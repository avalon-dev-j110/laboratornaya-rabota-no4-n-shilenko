package ru.avalon.java.dev.j10.labs;

import java.util.Date;

/**
 * @author Nikolai Shilenko
 *
 */
public abstract class AbstractPerson implements Person {
	private String name;
	private Date birthDate;
	
	protected AbstractPerson(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public abstract int compareTo(Person o);
}
