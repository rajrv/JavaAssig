package com.ttn.jpqlAndNativeSql.Repos;

import com.ttn.jpqlAndNativeSql.EmployeeTableEntity.EmployeeTableEntity;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<EmployeeTableEntity,Long> {

    @Query("from EmployeeTableEntity")
    List<EmployeeTableEntity> findAllEmployees();
}
