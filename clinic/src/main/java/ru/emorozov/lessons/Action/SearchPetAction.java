package ru.emorozov.lessons.Action;

import ru.emorozov.lessons.Clinic;
import ru.emorozov.lessons.Validator;

/**
 * Created by Eugene on 06.07.2017.
 */
public class SearchPetAction implements Action{

	@Override
	public void execute(Clinic clinic, Validator validator) {
		final String name = validator.getString("Enter pet name : ");
		clinic.searchPet(name);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String intro() {
		return String.format("%s - search pet", this.key());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int key() {
		return 6;
	}
}
