package com.homepage.model;

import java.util.ArrayList;
import java.util.List;

public class NameList {
    private List<String> names = new ArrayList<>();

    public List<String> getNames() {
        return names;
    }

    public void addName(String name) {
        names.add(name);
    }
}
