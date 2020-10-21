package ru.avalon.java.dev.j10.labs;

import java.util.Date;
import java.util.Random;

/**
 * @author Nikolai Shilenko
 *
 */
public class DateGenerator {
	@SuppressWarnings("deprecation")
	public static Date getRandomDate(int bound) {
		Random random = new Random();
		return new Date(random.nextInt(bound), random.nextInt(11), random.nextInt(30) + 1 );
	}
}