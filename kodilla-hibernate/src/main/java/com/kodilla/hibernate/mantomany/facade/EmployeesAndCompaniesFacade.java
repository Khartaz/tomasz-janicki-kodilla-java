package com.kodilla.hibernate.mantomany.facade;

import com.kodilla.hibernate.mantomany.Company;
import com.kodilla.hibernate.mantomany.Employee;
import com.kodilla.hibernate.mantomany.dao.CompanyDao;
import com.kodilla.hibernate.mantomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesAndCompaniesFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeesAndCompaniesFacade.class);

    public List<Employee>  searchEmployee(String employeeName) throws EmployeesAndCompaniesException {

        LOGGER.info("Searching...");
        List<Employee> result =  employeeDao.search(employeeName);
        if (result == null) {
            throw new EmployeesAndCompaniesException(EmployeesAndCompaniesException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return result;
    }

    public List<Company> searchCompany(String companyName) throws EmployeesAndCompaniesException {

        LOGGER.info("Searching...");
        List<Company> result = companyDao.search(companyName);
        if (result == null) {
            throw new EmployeesAndCompaniesException(EmployeesAndCompaniesException.COMPANY_NOT_FOUND);
        }
        return result;
    }
}
