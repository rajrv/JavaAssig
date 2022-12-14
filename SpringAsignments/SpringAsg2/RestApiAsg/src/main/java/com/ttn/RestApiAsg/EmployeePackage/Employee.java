package com.ttn.RestApiAsg.EmployeePackage;

import jakarta.validation.constraints.Size;

public class Employee {


        private Integer id;
       @Size(min = 2)
        private String name;
        private Integer age;

        public Employee(Integer id, String name, Integer age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public Integer getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ",name='" + name + '\'' +
                    ",age=" + age +
                    '}';
        }
}
