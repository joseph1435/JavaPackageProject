package myapp.classes;

import myapp.abstracts.Animal;

public class Dog extends Animal {
    private String breed;
    private boolean trained;

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public boolean isTrained() { return trained; }
    public void setTrained(boolean trained) { this.trained = trained; }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
