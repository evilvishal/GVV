package com.example.dto.Mapper;

import org.springframework.stereotype.Component;

import com.example.dto.Entity.Dtousers;
import com.example.dto.Entity.Users;
@Component
public class Mapusers {

    public Dtousers dto(Users users){
        Dtousers dtousers=new Dtousers();
        dtousers.setUsername(users.getUsername());
        dtousers.setEmail(users.getEmail());
        return dtousers;
    }

    public Users dtoentity(Dtousers dtousers){
        Users users=new Users();
        users.setUsername(dtousers.getUsername());
        users.setEmail(dtousers.getEmail());
        users.setPassword(dtousers.getPassword());
         return users;

    }
}
