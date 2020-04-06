package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary;


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        System.out.println("Your salary is now: " + salary);
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (this.salary > car.value) {
            System.out.println("You bought a car for cash");
            this.car = car;
        } else if (this.salary >= car.value / 12) {
            System.out.println("You bought a car with credit support.");
            this.car = car;
        } else {
            System.out.println("Sorry, you won't buy this car");
        }
    }
}

