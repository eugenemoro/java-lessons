package ru.emorozov.lessons;

import java.util.ArrayList;

/**
 * Created by Eugene on 04.07.2017.
 * Contains info about Clients behavior, its pets.
 */
public class Client {
	private String id;
	private final ArrayList<Animal> pets = new ArrayList<>();

	public void addPet(final Animal pet){
		this.pets.add(pet);
	}

	public Client(){
	}

	public Client(String id){
		this.id = id;
	}

	public Client(String id, Animal pet){
		this.id = id;
		this.addPet(pet);
	}

	public String getId() {
		return id;
	}

	public ArrayList<Animal> getPets() {
		return pets;
	}

	public void setId(String id) {
		this.id = id;
	}
}
