package com.app.core;

public enum Course {
    DBT,
    REACT,
    ANGULAR,
    REST,
    SPRING,
    HIBERNATE;
    @Override
    public String toString() {
        return "Course:" +name();
    }
}
