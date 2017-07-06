package ru.emorozov.lessons.Action;

import ru.emorozov.lessons.Clinic;
import ru.emorozov.lessons.Validator;

/**
 * Created by Eugene on 06.07.2017.
 */
public class DeletePetAction implements Action{

	@Override
	public void execute(Clinic clinic, Validator validator) {
		final String name = validator.getString("Enter pet name : ");
		clinic.deletePet(name);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String intro() {
		return String.format("%s - delete pet", this.key());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int key() {
		return 8;
	}
}
