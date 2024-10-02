package Assignmentoct3;

 abstract public class Assignment3 {

	// Abstract class Animal
	
	    // Abstract method for sound
	    public abstract void sound();

	    // Abstract method for movement
	    public abstract void move();
	}

	// Concrete subclass Dog
	class Dog extends Assignment3 {
	    // Implementing the sound method for Dog
	    @Override
	    public void sound() {
	        System.out.println("The dog barks");
	    }

	    // Implementing the move method for Dog
	    @Override
	    public void move() {
	        System.out.println("The dog runs");
	    }
	}

	// Concrete subclass Cat
	class Cat extends Assignment3 {
	    // Implementing the sound method for Cat
	    @Override
	    public void sound() {
	        System.out.println("The cat meows");
	    }

	    // Implementing the move method for Cat
	    @Override
	    public void move() {
	        System.out.println("The cat walks gracefully");
	    }
	}

	// Concrete subclass Bird
	class Bird extends Assignment3 {
	    // Implementing the sound method for Bird
	    @Override
	    public void sound() {
	        System.out.println("The bird chirps");
	    }

	    // Implementing the move method for Bird
	    @Override
	    public void move() {
	        System.out.println("The bird flies");
	    }
	}

	
	

