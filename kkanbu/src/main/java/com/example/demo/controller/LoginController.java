package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.example.demo.model.Login;
import com.example.demo.repo.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LoginController {

    @Autowired
    private LoginRepo loginRepo;

    @GetMapping("/login/list")
    public List<Login> getAllData() {

        return loginRepo.findAll();
    }

    @GetMapping("/login/{id}")
    public Optional<Login> getDataById(@PathVariable int id) {

        return loginRepo.findById(id);
    }

    @PostMapping("/login/add")
    public Map putNewDataOnDb(@RequestBody Login login) {

        loginRepo.save(login);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Inserted Successfully");
        return response;

    }

    @PutMapping("/login/update")
    public Map updateDataOnDb(@RequestBody Login login) throws Exception {
        if (login.getId() > 0) {
            loginRepo.save(login);
            Map<String, String> response = new HashMap<>();
            response.put("message", "Updated Successfully");
            return response;
        } else {
            throw new Exception("Bad Request for Update!");
        }

    }

    @DeleteMapping("/login/delete")
    public Map deleteDataOnDb(@RequestBody Login login) throws Exception {
        if (login.getId() > 0) {
            loginRepo.delete(login);
            Map<String, String> response = new HashMap<>();
            response.put("message", "Deleted Successfully");
            return response;
        } else {
            throw new Exception("Bad Request for Update!");
        }

    }

    @PostMapping("/login/check")
    public Map checkUserNameAndPassword(@RequestBody Login login) throws Exception {
        Map<String, String> response = new HashMap<>();
        if (login.getEmail() != null && login.getPassword() != null) {

            Optional<Login> loginO = loginRepo.findByUsernameAndPassword(login.getEmail(), login.getPassword());
            if(loginO.isPresent()) {
                response.put("message", "Login Successfully");
                return response;
            } else {
                response.put("message", "Invalid Email or Password");
                return response;
            }
        } else {
            response.put("message", "Enter Email or Password");
            return response;
        }

    }

}
