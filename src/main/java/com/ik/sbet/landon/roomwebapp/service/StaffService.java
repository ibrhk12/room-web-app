package com.ik.sbet.landon.roomwebapp.service;

import com.ik.sbet.landon.roomwebapp.models.Room;
import com.ik.sbet.landon.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {
    private static final List<Staff> employees = new ArrayList<>();
    static {
        for(int i = 1; i <= 10; i++)
            employees.add(new Staff(i, "employee " + i, "Emp " + i));
    }
    public List<Staff> getEmployees(){ return employees;}
}
