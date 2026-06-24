package com.oops.relationshipandobjectbehaviour;

import java.util.ArrayList;
import java.util.List;

class University {
    private List<College> colleges;
    private String name;

    public University(String name) {
        this.name = name;
        this.colleges = new ArrayList<>();
    }

    public void addCollege(String collegeName, String collegeId) {
        colleges.add(new College(collegeName, collegeId));
    }

    public void displayDetails() {
        System.out.println("University Name : " + name);

        for (int i = 0; i < colleges.size(); i++) {
            System.out.println("College Name : " + colleges.get(i).getName());
            System.out.println("College ID : " + colleges.get(i).getId());
        }
    }

}

class College {
    private String name, id;

    public College(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

}

public class RelationshipExercise {

}
