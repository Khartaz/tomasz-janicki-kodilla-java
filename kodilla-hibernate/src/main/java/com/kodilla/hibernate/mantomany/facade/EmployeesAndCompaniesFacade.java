package com.kodilla.hibernate.mantomany.facade;

import com.kodilla.hibernate.mantomany.Company;
import com.kodilla.hibernate.mantomany.Employee;
import com.kodilla.hibernate.mantomany.dao.CompanyDao;
import com.kodilla.hibernate.mantomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesAndCompaniesFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeesAndCompaniesFacade.class);

    public void process(final Company company, String arg) throws EmployeesAndCompaniesException {
        boolean wasError = false;
        Employee employee = new Employee();
        if (company == null) {
            LOGGER.error(EmployeesAndCompaniesException.COMPANY_NOT_FOUND);
            throw new EmployeesAndCompaniesException(EmployeesAndCompaniesException.ERR_EMPLOYEE_NOT_FOUND);
        }

        try {

            for (Employee employeeDto1 : company.getEmployees()) {
                LOGGER.info("Searching...");
                employeeDao.findByArg(arg);
                wasError = true;
                throw new EmployeesAndCompaniesException(EmployeesAndCompaniesException.COMPANY_NOT_FOUND);
            }
            for (Company companyDto1 : employee.getCompanies());
                LOGGER.info("Searching...");
                companyDao.findByArg(arg);
        } finally {
            if (wasError) {
                LOGGER.info("");
            }
        }
    }
}
