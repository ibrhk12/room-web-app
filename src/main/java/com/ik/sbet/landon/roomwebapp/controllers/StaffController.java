package com.ik.sbet.landon.roomwebapp.controllers;

import com.ik.sbet.landon.roomwebapp.models.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {
    private static final List<Staff> employees = new ArrayList<>();
    static {
        for(int i = 1; i <= 10; i++)
            employees.add(new Staff(i, "employee " + i, "grade"));
    }
    @GetMapping
    public String getAllStaff(Model model){
        model.addAttribute("employees", employees);
        return "staff";
    }
}
