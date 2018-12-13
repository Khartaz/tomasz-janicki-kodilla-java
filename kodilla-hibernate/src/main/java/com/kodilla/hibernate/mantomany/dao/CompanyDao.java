package com.kodilla.hibernate.mantomany.dao;

import com.kodilla.hibernate.mantomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository <Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> findByFirstDigits(@Param("DIGIT") String companyName);

    @Query(nativeQuery = true)
    List<Company> search(@Param("ARG") String companyName);
}