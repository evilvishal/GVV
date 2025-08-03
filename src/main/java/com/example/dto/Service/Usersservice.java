package com.example.dto.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Entity.Dtousers;
import com.example.dto.Entity.Users;
import com.example.dto.Mapper.Mapusers;
import com.example.dto.Repository.Usersrepo;

@Service
public class Usersservice {
    @Autowired
    Usersrepo usersrepo;
    @Autowired
    Mapusers mapusers;
    public List<Dtousers> getallusers(){
       List<Users> Userlist=  usersrepo.findAll();
        return Userlist.stream()
               .map(mapusers::dto)
               .collect(Collectors.toList());
    }
      public Dtousers saveallusers(Dtousers dtousers){
        Users users=mapusers.dtoentity(dtousers);
         Users users2=usersrepo.save(users);
        return mapusers.dto(users2);
}  
}