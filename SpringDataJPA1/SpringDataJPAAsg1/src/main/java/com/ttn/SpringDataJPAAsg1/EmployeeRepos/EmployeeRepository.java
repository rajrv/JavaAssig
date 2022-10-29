package com.ttn.SpringDataJPAAsg1.EmployeeRepos;

import com.ttn.SpringDataJPAAsg1.EmployeeEntity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<EmployeeEntity,Integer> {

    List<EmployeeEntity> findByName(String name);
    List<EmployeeEntity> findByNameLike(String name);

    List<EmployeeEntity> findByAgeBetween(Integer startingAge, Integer endingAge);



}
