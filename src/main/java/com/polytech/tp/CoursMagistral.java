package com.polytech.tp;

public class CoursMagistral extends CoursDecorator {
    public CoursMagistral(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " (Magistral)";
    }

    @Override
    public double getDuree() {
        // Cours magistral might have longer duration
        return coursDecorated.getDuree();
    }
}
