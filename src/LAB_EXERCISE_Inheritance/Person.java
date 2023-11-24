/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_EXERCISE_Inheritance;

/**
 *
 * @author PC
 */
public class Person {
    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public static void main(String[] args) {

        Student student = new Student("Mj Obsid Magsalo", 2004, "Computer Science");
        System.out.println(student);

        Instructor instructor = new Instructor("Kiboloy", 1995, 35000.0);
        System.out.println(instructor);

    }

}
