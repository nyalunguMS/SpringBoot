package org.example.springboot;

import java.util.ArrayList;
import java.util.List;

public class SoftwareDeveloper {
     public int id;
     public String name;
     public String email;
     public List<String> techStack = new ArrayList<>();

    public SoftwareDeveloper(int id, String name, String email, List<String> techStack) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.techStack = techStack;
    }
}
