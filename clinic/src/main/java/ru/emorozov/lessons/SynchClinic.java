package ru.emorozov.lessons;

public class SynchClinic extends Clinic {
	public synchronized void addClient (Client client){
		super.addClient(client);
	}

	public synchronized void addPet(String name, Animal pet){
		super.addPet(name, pet);
	}

	public synchronized void updateClient(String name, String newName){
		super.updateClient(name, newName);
	}

	public synchronized void updatePet(String nameOfOwner, String newName){
		super.updatePet(nameOfOwner, newName);
	}

	public synchronized void deleteClient(String name){
		super.deleteClient(name);
	}

	public synchronized void deletePet(String name){
		super.deletePet(name);
	}

	public synchronized Client searchClient(String name){
		return super.searchClient(name);
	}

	public synchronized Animal searchPet(String name){
		return super.searchPet(name);
	}
}
