package com.njucm.itf.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query(value = "SELECT * FROM user WHERE name = ?1 and password = ?2", nativeQuery = true)
    public List<User> findByNameAndPassword(String name, String password);
    @Query(value = "SELECT * FROM user WHERE name = ?1", nativeQuery = true)
    public List<User> findByName(String name);
}
