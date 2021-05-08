package com.amigoscode.javafunctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class imperativeDeclarative {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Alex", Gender.MALE),
				new Person("Sara", Gender.FEMALE),
				new Person("Gio", Gender.FEMALE),
				new Person("Megan", Gender.FEMALE),
				new Person("Robert", Gender.MALE),
				new Person("Toni", Gender.MALE));
		
		//Imperative Approach - Count No. of females
		System.out.println("---------//Imperative Approach - Print females--------");
		List<Person> females = new ArrayList<>();
		for(Person p: people)
		{
			if(p.getGender().equals(Gender.FEMALE))
			{
				females.add(p);
			}
		}
		for(Person f: females)
		{
			System.out.println(f);
		}
		System.out.println("No. of Females is "+ females.size());
		
		//Declarative Approach - Just Print of females
		System.out.println("---------//Declarative Approach - Just Print females--------");
		people.stream()
			.filter(p -> p.getGender().equals(Gender.FEMALE))
			.forEach(System.out::println);
		
		//Work same as above- Collect into a list all females and print them
		System.out.println("---------//Declarative Approach - Collect into a list all females and print them--------");
		List<Person> f = people.stream()
		//filter(Predicate<Person>)
		.filter(p -> p.getGender().equals(Gender.FEMALE))
		.collect(Collectors.toList());
		
		f.forEach(System.out::println);
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
