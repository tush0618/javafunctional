package com.amigoscode.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Alex", Gender.MALE),
				new Person("Sara", Gender.FEMALE),
				new Person("Gio", Gender.FEMALE),
				new Person("Megan", Gender.FEMALE),
				new Person("Robert", Gender.MALE),
				new Person("Toni", Gender.MALE));


		//------Iterate over the list and print all distinct type of Genders.
		people.stream()
		.map(p -> p.getGender()) //Takes in Function i.e. a Person Object and returns anything like Gender
		//ex. String/Integer/Custom Object like Gender, etc
		.collect (Collectors.toSet()) //Takes in 3 args, i/p object, Type of collection List/Set and return type (Set to remove duplicate)
		.forEach(System.out::println); //Takes in Consumer i.e. void return type and single i/p arg ex. Gender


		//--------Iterate over the list and print the length of persons name
		people.stream()
		.map(p -> p.getName()) //Takes in the person object and return just the name of the person
		.mapToInt(name -> name.length()) //Takes in the name from the map above and return the length of each name
		.forEach(System.out::println); //Print the length

		//Same thing with arguments extracted as local variables
		//--------Iterate over the list and print the length of persons name
		ToIntFunction<? super String> toIntFunction = name -> name.length();
		Function<? super Person, ? extends String> function = p -> p.getName();
		IntConsumer intConsumer = System.out::println;
		people.stream()
		.map(function) //Takes in the person object and return just the name of the person
		.mapToInt(toIntFunction) //Takes in the name from the map above and return the length of each name
		.forEach(intConsumer); //Print the length of the name

		//--------Iterate over the list and validate that there are only females in the list
		boolean containsOnlyFemales = 
				people.stream()
				.allMatch(p -> Gender.FEMALE.equals(p.getGender()));

		System.out.println(containsOnlyFemales);

		//--------Iterate over the list and validate that there is any female in the list
		boolean containsAnyFemales = 
				people.stream()
				.anyMatch(p -> Gender.FEMALE.equals(p.getGender()));

		System.out.println(containsAnyFemales);


		//--------Iterate over the list and validate that there is no female in the list
		boolean containsNoFemales = 
				people.stream()
				.noneMatch(p -> Gender.FEMALE.equals(p.getGender()));

		System.out.println(containsNoFemales);
				
	}


	static class Person
	{
		private String name;
		private Gender gender;
		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	enum Gender{
		MALE, FEMALE;
	}


}
