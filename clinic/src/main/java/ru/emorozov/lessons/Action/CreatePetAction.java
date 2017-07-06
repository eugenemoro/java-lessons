package ru.emorozov.lessons.Action;

import ru.emorozov.lessons.*;

import java.util.Arrays;

/**
 * Created by Eugene on 06.07.2017.
 */
public class CreatePetAction implements Action {
	@Override
	public void execute(Clinic clinic, Validator validator) {
		final String name = validator.getString("Enter client name : ");
		final int petType = validator.getIntFromList("Enter pet type : 1. Cat, 2. Dog: ", Arrays.asList(1, 2));
		final String petName = validator.getString("Enter pet name : ");
		Animal pet = petType == 1 ? new Cat(petName) : new Dog(petName);
		clinic.addPet(name, pet);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String intro() {
		return String.format("%s - create pet", this.key());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int key() {
		return 2;
	}
}
