package com.example.planet;

public class Planet {
    private String Name;
    private String Size;
    private  String Orbit;

    @Override
    public String toString() {
        return "Planet{" +
                "Name='" + Name + '\'' +
                ", Size='" + Size + '\'' +
                ", Orbit='" + Orbit + '\'' +
                '}';
    }

    public Planet() {
    }

    public Planet(String name, String size, String orbit) {
        Name = name;
        Size = size;
        Orbit = orbit;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getOrbit() {
        return Orbit;
    }

    public void setOrbit(String orbit) {
        Orbit = orbit;
    }
}
