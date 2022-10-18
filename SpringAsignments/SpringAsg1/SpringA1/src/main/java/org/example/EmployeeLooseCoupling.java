package org.example;

public class EmployeeLooseCoupling {
    String name;
    String deptName;
    String designation;
    Address address;

    public EmployeeLooseCoupling(String name, String deptName, String designation, Address address) {
        this.name = name;
        this.deptName = deptName;
        this.designation = designation;
        this.address = address;
    }

    @Override
    public String toString() {
        return ("EmployeeLooseCoupling:\n" +
                "Name='" + name +
                "\nDept. Name='" + deptName +
                "\nDesignation='" + designation +
                "\nAddress=" + address);
    }
}
