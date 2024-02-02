package com.ik.sbet.landon.roomwebapp.controllers;

import com.ik.sbet.landon.roomwebapp.models.Staff;
import com.ik.sbet.landon.roomwebapp.service.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
    private final StaffService staffService;
    public StaffRestController() {
        staffService = new StaffService();
    }

    @GetMapping
    public List<Staff> getStaff(){ return staffService.getEmployees();}
}
