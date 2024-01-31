package com.ik.sbet.landon.roomwebapp.controllers;

import com.ik.sbet.landon.roomwebapp.models.Staff;
import com.ik.sbet.landon.roomwebapp.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    private StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getAllStaff(Model model){
        model.addAttribute("employees", staffService.getEmployees());
        return "staff";
    }
}
