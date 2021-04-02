package com.techprimers.db.springbootmysql.resource;

import com.techprimers.db.springbootmysql.model.Users;
import com.techprimers.db.springbootmysql.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")

public class UserResource {
    @Autowired
    UserRepository userRepository;
    @GetMapping(value = "/all")
    public List<Users> getAll(){
        return userRepository.findAll();

    }
    @PostMapping(value = "/load")
    public List<Users>persit(@RequestBody final Users users){
        userRepository.save(users);
        return userRepository.findAll();
     }
////    @PutMapping(value = "/id")
////    public void persit (@RequestBody final Users users)
////    {
////        userRepository.save(users);
////    }
//    @DeleteMapping("/id")
//    public void DeleteUser(@RequestBody final Users users)
//    {
//        userRepository.delete(users);
//    }





}
