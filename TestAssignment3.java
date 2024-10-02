package Assignmentoct3;

public class TestAssignment3 {
	
	    public static void main(String[] args) {
	        // Creating objects of each concrete class
	    	Assignment3 dog = new Dog();
	    	Assignment3 cat = new Cat();
	    	Assignment3 bird = new Bird();

	        // Calling methods for Dog
	        System.out.println("Dog:");
	        dog.sound();
	        dog.move();

	        // Calling methods for Cat
	        System.out.println("\nCat:");
	        cat.sound();
	        cat.move();

	        // Calling methods for Bird
	        System.out.println("\nBird:");
	        bird.sound();
	        bird.move();
	    }
	}



