package design_patterns.builder;

public class BuilderPatternTest {

    public static void main(String[] args) {

        // below statement won't work as the constructor is private
        // Employee employee = new Employee(null);

        // below statement would work
        Employee johnDoe =  Employee.builder()
                                    .employeeId("1")
                                    .employeeName("John Doe")
                                    .employeeSalary(100000)
                                    .employeeAge(40)
                                    .build();

        System.out.println(johnDoe);

    }

}