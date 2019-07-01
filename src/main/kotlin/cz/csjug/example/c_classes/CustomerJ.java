package cz.csjug.example.c_classes;


import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

import java.util.Calendar;

final public class CustomerJ {
    final private String name;
    final private Integer yearOfBirth;
    private String socialSecurityNumber;

    public CustomerJ(String name, Integer yearOfBirth) {
        if(name == null) {
            throw new IllegalArgumentException("name can'nt be null");
        }
        if(yearOfBirth == null) {
            throw new IllegalArgumentException("yearOfBirth can'nt be null");
        }
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public CustomerJ(String name, Integer yearOfBirth, String socialSecurityNumber) {
        this(name, yearOfBirth);
        this.setSocialSecurityNumber(socialSecurityNumber);
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = validateSN(socialSecurityNumber);
    }

    public String toString() {
        return "CustomerK(name=" + this.name + ", yearOfBirth=" + this.yearOfBirth + ")";
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof CustomerK) {
                CustomerK var2 = (CustomerK)var1;
                if (Intrinsics.areEqual(this.name, var2.getName()) && this.yearOfBirth == var2.getYearOfBirth()) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }

    private String validateSN(String value) {
        if(value == null || !value.startsWith("SN")) {
            throw new IllegalArgumentException("Social Security Number should start with SN");
        }
        return value;
    }

    public static void main(String[] args) {
        CustomerJ pepa = new CustomerJ("Pepa", 1990, "SN4");
        System.out.println(pepa);
    }
}

