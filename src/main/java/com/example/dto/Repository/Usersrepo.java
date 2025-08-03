package com.example.dto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.Entity.Users;
@Repository
public interface Usersrepo extends JpaRepository<Users,Long>  {
    
}
