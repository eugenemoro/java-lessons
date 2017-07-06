package ru.emorozov.lessons.Action;

import ru.emorozov.lessons.Client;
import ru.emorozov.lessons.Clinic;
import ru.emorozov.lessons.Validator;

/**
 * Created by Eugene on 06.07.2017.
 */
public class ShowAction implements Action {


	/**
	 * {@inheritDoc}
	 */
	@Override
	public void execute(Clinic clinic, Validator validator) {
		for (Client client : clinic.getClients()) {
			System.out.println(client);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String intro() {
		return String.format("%s - show clients", this.key());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int key() {
		return 0;
	}
}
