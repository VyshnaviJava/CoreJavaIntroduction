package com.languagefundamentals.constructors;

public class Movie {

	
	String hero;
	String heroine;
	String director;
	double budget;
	String movieName;
	String producer;
	
	Movie(){
		System.out.println("no arg constructor called");
	}
	Movie(String producer , String director){
		System.out.println("parameterized constructor called");
		this.producer = producer;
		this.director = director;
	}
	Movie(Movie m,String hero , double budget){
	
		System.out.println("parameterized 2 constructor called");
		this.hero = hero;
		this.budget = budget;
		this.producer = m.producer;
		this.director = m.director;
	}
	Movie(Movie m,String heroine,String movieName){
		System.out.println("parameterized 3 construtor called");
		this.budget = m.budget;
		this.director =m.director;
		this.producer =m.producer;
		this.hero =m.hero;
		this.heroine = heroine;
		this.movieName= movieName;
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Movie m1 = new Movie();
		m1.showDetails();
		
		Movie m2 = new Movie("DVV" , "Rajamouli");
		m2.showDetails();
		
		Movie m3 = new Movie( m2,"Mahesh babu",5000000.00);
		m3.showDetails();
		
		Movie m4 = new Movie(m3,"priyanka chopra", "varanasi");
		m4.showDetails();
		
		
		System.out.println("main method ended");

	}
	
	void showDetails() {
		System.out.println("Name of the Hero : " + hero);
		System.out.println("Name of the Heroine : " + heroine);
		System.out.println("Name of the Movie : " + movieName);
		System.out.println("Name of the Director : " + director);
		System.out.println("Name of the producer : " + producer);
		System.out.println("Name of the Movie : " + budget);
		System.out.println("********************************");
	}

}
