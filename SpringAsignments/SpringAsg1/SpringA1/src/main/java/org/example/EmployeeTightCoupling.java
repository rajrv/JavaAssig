package org.example;

public class EmployeeTightCoupling
{
    Address address;
    String name;
    String deptName;
    String designation;

    public EmployeeTightCoupling(String name, String deptName, String designation, String houseNo, String streetName, String city, String state) {
        this.address = new Address(houseNo,streetName,city,state);
        this.name = name;
        this.deptName = deptName;
        this.designation = designation;
    }

    @Override
    public String toString(){
        return("EmployeeTightCoupling\n"+"Name:"+ name+ "\nDepartmentName: "+deptName+"\nDesignation:"+designation+"\n"+address);
    }
}
