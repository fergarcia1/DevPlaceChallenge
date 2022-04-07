package com.company;

public class Employee extends Person{

    public String file;
    public String deparment;

    //Constructores
    public Employee(String firstName, String lastName, String birthDay, String file, String deparment) {
        super(firstName, lastName, birthDay);
        this.file = file;
        this.deparment = deparment;
    }
    public Employee() {
    }

    //Getters y setters
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

}
