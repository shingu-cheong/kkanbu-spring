package com.example.demo.controller;

import com.example.demo.model.Login;
import com.example.demo.model.Olderman;
import com.example.demo.repo.LoginRepo;
import com.example.demo.repo.OldermanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OldermanController {
    @Autowired
    private OldermanRepo oldermanRepo;

    @GetMapping("/Olderman/list")
    public List<Olderman> getAllData() {

        return oldermanRepo.findAll();
    }

    @GetMapping("/Olderman/{manId}")
    public Optional<Olderman> getDataById(@PathVariable int manId) {

        return oldermanRepo.findById(manId);
    }



    @PostMapping("/Olderman/add")
    public Map addOlderman(@RequestBody Olderman olderman) {

        oldermanRepo.save(olderman);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Inserted Successfully");
        return response;

    }

    @PutMapping("/Olderman/update")
    public Map updateOlderman(@RequestBody Olderman olderman) throws Exception {
        if (olderman.getManId() > 0) {
            oldermanRepo.save(olderman);
            Map<String, String> response = new HashMap<>();
            response.put("message", "Updated Successfully");
            return response;
        } else {
            throw new Exception("Bad Request for Update!");
        }

    }

    @DeleteMapping("/Olderman/delete")
    public Map deleteOlderman(@RequestBody Olderman olderman) throws Exception {
        if (olderman.getManId() > 0) {
            oldermanRepo.delete(olderman);
            Map<String, String> response = new HashMap<>();
            response.put("message", "Deleted Successfully");
            return response;
        } else {
            throw new Exception("Bad Request for Update!");
        }

    }
}
