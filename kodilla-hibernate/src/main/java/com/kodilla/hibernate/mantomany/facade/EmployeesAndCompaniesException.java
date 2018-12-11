package com.kodilla.hibernate.mantomany.facade;

public class EmployeesAndCompaniesException extends Exception {

    public static String COMPANY_NOT_FOUND = "Company not found";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee not found";

    public EmployeesAndCompaniesException(String message) {
        super(message);
    }
}
