package com.example.customapdaterlistview;

public class Student {
    private String id;
    private String name;
    private String numberPhone;

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Student(String id, String name, String numberPhone) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
    }
}
