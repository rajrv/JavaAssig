package org.example;

public class Main {
    public static void main(String[] args) {


        EmployeeTightCoupling e1 = new EmployeeTightCoupling("Alex","Backend","Software Engineer","11","Laxmi Bai Marg","Greater Noida","U.P.");
        System.out.println(e1);

        System.out.println("--------------------------------------");
        EmployeeLooseCoupling e2 = new EmployeeLooseCoupling("Clair","Java","Senior Software Engineer",new Address("12","Lajpat Nagar","New Delhi","Delhi"));
        System.out.println(e2);
    }
}