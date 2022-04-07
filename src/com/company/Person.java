package com.company;

public class Person {

    private String firstName = "noName";
    private String lastName = "noLastname";
    private String birthDay = "noBirthday";

    //Constructores
    public Person(String firstName, String lastName, String birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }
    public Person(){
    }

    //Getters y setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    //Sobrecarga del metodo override
    @Override
    public String toString(){
        return "Mi nombre es: " + this.firstName + " " + this.lastName;
    }

    //Metodos

    public void myInfo(){
        System.out.println("Nombre: " + this.firstName);
        System.out.println("Apellido: " + this.lastName);
        System.out.println("Fecha de Nacimiento: " + this.birthDay);
    }

    public boolean compararInstancias(Person persona){
        boolean b;

        b = this.birthDay.equals(persona.birthDay); //se comparan todos los datos y si alguno no es igual va a devolver false, si los 3 son iguales true.
        b = this.firstName.equals(persona.firstName);
        b = this.lastName.equals(persona.lastName);

        return b;
    }


}
