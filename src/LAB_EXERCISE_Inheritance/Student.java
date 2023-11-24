/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_EXERCISE_Inheritance;

public class Student extends Person {

    private String major;

    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student: " + getName() + ",Year of Birth:" + getYearOfBirth() + ",Major:" + major;
    }
}
