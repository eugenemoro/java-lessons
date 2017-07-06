package ru.emorozov.lessons.Action;

import ru.emorozov.lessons.Client;
import ru.emorozov.lessons.Clinic;
import ru.emorozov.lessons.Validator;


/**
 * Created by Eugene on 06.07.2017.
 */
public class CreateClientAction implements Action {

	@Override
	public void execute(Clinic clinic, Validator validator) {
		final String name = validator.getString("Enter client name : ");
		final Client client = new Client(name);
		clinic.addClient(client);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String intro() {
		return String.format("%s - create client", this.key());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int key() {
		return 1;
	}
}
