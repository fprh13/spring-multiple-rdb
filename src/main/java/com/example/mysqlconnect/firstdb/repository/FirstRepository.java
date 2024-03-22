package com.example.mysqlconnect.firstdb.repository;

import com.example.mysqlconnect.firstdb.entity.FirstEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirstRepository extends JpaRepository<FirstEntity,Long> {
}
