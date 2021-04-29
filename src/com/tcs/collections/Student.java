package com.tcs.collections;

import java.util.Objects;

public class Student extends Person {

    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public Student setSchoolName(String schoolName) {
        this.schoolName = schoolName;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSchoolName(), getSchoolName());
    }
}
