package com.example.fragmentsdemo;

public class Position {
    private String title;
    private String description;

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public static final Position[] positions = {
      new Position("IOS developer", "Developing IOS applications."),
      new Position("JAVA developer", "Developing java se & ee applications."),
      new Position("android developer", "Developing Andriod based applications"),
      new Position("firmware designer","designing firmwares for ios systems."),
      new Position("Hotel Manager", "Managing hotel")
    };

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
