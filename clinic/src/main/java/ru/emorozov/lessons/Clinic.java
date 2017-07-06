package ru.emorozov.lessons;

import java.util.ArrayList;

/**
 * Created by Eugene on 04.07.2017.
 * Main class should contain methods to save, add and delete clients and pets
 */
public class Clinic {
	private final ArrayList<Client> clients = new ArrayList<>();

	public void addClient(final int position, final Client client){
		clients.add(position, client);
	}

	public void addPet(String name, Animal pet){
		this.searchClient(name).addPet(pet);
	}

	public void updateClient(String name){
		this.searchClient(name).setId(name);
	}

	public void updatePet(String name, String newName){
		this.searchPet(name).setName(newName);
	}

	public void deleteClient(String name){
		clients.remove(this.searchClient(name));
	}

	public void deletePet(String name){
		for (Client client : clients) {
			for (Animal pet : client.getPets()){
				if (pet.getName().equals(name)) {
					client.getPets().remove(pet);
				}
			}
		}
	}

	public Client searchClient(String name){
		for (Client client : clients){
			if (client.getId().equals(name)){
				return client;
			}
		}
		return null;
	}

	public Animal searchPet(String name){
		for (Client client : clients) {
			for (Animal pet : client.getPets()){
				if (pet.getName().equals(name)) {
					return pet;
				}
			}
		}
		return null;
	}
}
