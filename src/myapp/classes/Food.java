package myapp.classes;

import myapp.interfaces.Eatable;

public class Food implements Eatable {
    private String name;
    private int calories;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getCalories() { return calories; }
    public void setCalories(int calories) { this.calories = calories; }

    @Override
    public void prepare() {
        System.out.println("Food is being prepared.");
    }

    @Override
    public void eat() {
        System.out.println("Food is being eaten.");
    }

    @Override
    public void discard() {
        System.out.println("Leftovers discarded.");
    }
}
