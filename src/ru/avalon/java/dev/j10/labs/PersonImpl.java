package ru.avalon.java.dev.j10.labs;

import java.util.Date;

/**
 * @author Nikolai Shilenko
 *
 */
public class PersonImpl extends AbstractPerson {

	public PersonImpl(String name, Date birthDate) {
		super(name, birthDate);
	}

	@Override
	public int compareTo(Person o) {
	//используем метод compareTo из класса String для сравнения имён
		int result = this.getName().compareTo(o.getName());
	//если имена одинаковые -  сравниваем возраст,
	//используя метод compareTo из класса Date
	    if (result == 0) {
	        result = this.getBirthDate().compareTo(o.getBirthDate()) < 0 ? 1 : -1; // инвертируем значение метода compareTo класса Date, так как из двух людей больше тот, кто старше
	    }
	    return result;
	}
	
	String getPerson() {
		return getName() + " " + getBirthDate();
	}
}
