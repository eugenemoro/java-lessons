package ru.emorozov.lessons.Action;

import ru.emorozov.lessons.Clinic;
import ru.emorozov.lessons.Validator;

/**
 * Created by Eugene on 04.07.2017.
 * Describes the actions of the program.
 */
public interface Action {
	void execute(final Clinic clinic, final Validator validator);
	String intro();
	int key();
}
