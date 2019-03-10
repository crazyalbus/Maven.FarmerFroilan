package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {
    private String name;
    private Integer age;
    private Integer id;
    Silo silo;
    boolean hasBeenFertilized;
    
    public Chicken(String name, Integer age, Integer id) {
        super(name, age, id);
    }
    
    public void create(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    public void eat(Edible food) {
        silo.remove(food);
    }
    
    public EdibleEgg yield() {
        return null;
    }
    
    public String makeNoise() {
        return "Cluck!";
    }
    
    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }
    
    public void setHasBeenFertilized(boolean fertilized) {
        this.hasBeenFertilized = fertilized;
    }
}
