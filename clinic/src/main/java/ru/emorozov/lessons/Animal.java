package ru.emorozov.lessons;

/**
 * Created by Eugene on 04.07.2017.
 */
public abstract class Animal implements Pet{
	private String name;

	public Animal(final String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
