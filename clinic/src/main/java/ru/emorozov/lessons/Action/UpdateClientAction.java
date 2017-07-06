package ru.emorozov.lessons.Action;

import ru.emorozov.lessons.Client;
import ru.emorozov.lessons.Clinic;
import ru.emorozov.lessons.Validator;

/**
 * Created by Eugene on 06.07.2017.
 */
public class UpdateClientAction implements Action {

	@Override
	public void execute(Clinic clinic, Validator validator) {
		final String name = validator.getString("Enter old client name : ");
		final String newname = validator.getString("Enter new client name : ");
		clinic.updateClient(name, newname);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String intro() {
		return String.format("%s - update client", this.key());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int key() {
		return 3;
	}
}
