package com.thebe.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.thebe.rest.entity.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Integer> {
	
	@Query("SELECT m FROM Module m WHERE m.userId.userId = :userId ORDER BY m.orderData")
	List<Module> getModulesByUserId(@Param("userId") Integer userId);
	
}
