package com.ramostear.application.controller;

import com.ramostear.application.model.User;
import com.ramostear.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author ramostear
 * @create-time 2019/3/11 0011-4:42
 * @modify by :
 * @since:
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/users")
    public ResponseEntity<Object> users(){
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> create(@RequestBody User user){
       userService.create(user);
       return new ResponseEntity<>("User is created successfully.",HttpStatus.CREATED);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<Object> update(@PathVariable(name="id") long id,@RequestBody User user){
        userService.update(id,user);
        return new ResponseEntity<>("User is updated successfully.",HttpStatus.OK);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Object> delete(@PathVariable(name = "id")long id){
        userService.delete(id);
        return new ResponseEntity<>("User is deleted successfully.",HttpStatus.OK);
    }

}

