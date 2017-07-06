package ru.emorozov.lessons;

/**
 * Created by Eugene on 04.07.2017.
 */
public class ClinicRunner {
	public static void main(String[] args) {
		final Clinic clinic = new Clinic();

		clinic.addClient(0, new Client("Brown", new Cat("Digy")));
		clinic.addClient(1, new Client("Nick", new Dog("Sparky")));
		clinic.addClient(2, new Client("Ann", new Dog("Doggy")));

		System.out.println(clinic.searchClient("Ann").getId() + " " + clinic.searchPet("Doggy").getName());
		System.out.println(clinic.searchClient("Nick").getId() + " " + clinic.searchPet("Sparky").getName());
		System.out.println(clinic.searchClient("Brown").getId() + " " + clinic.searchPet("111").getName());
	}
}
