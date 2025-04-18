package com.emp;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String department;

    public Employee(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getDepartment() { return department; }
}
