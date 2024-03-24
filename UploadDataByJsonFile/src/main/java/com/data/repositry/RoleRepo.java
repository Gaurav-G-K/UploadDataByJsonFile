package com.data.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.entity.RolesAndAuthority;

public interface RoleRepo extends JpaRepository<RolesAndAuthority, Long>{

}
