package com.example.dto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Entity.Dtousers;
import com.example.dto.Service.Usersservice;
@RestController
@CrossOrigin(origins = "http://localhost:5173")

public class Userscontroller {
    
@Autowired
Usersservice usersservice;
@GetMapping("/")
public String home(){
    return "WELOCME TO MY SITE";
}
@GetMapping("all")
    public List<Dtousers> getallusers(){
    return usersservice.getallusers();
}    
@PostMapping("/save")
    public Dtousers setallusers(@RequestBody Dtousers users){
       return usersservice.saveallusers(users);
       
}}
