package com.dio.controleacesso.controller;

import com.dio.controleacesso.model.WorkingDay;
import com.dio.controleacesso.service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/working-day")
public class WorkingDayController {

    @Autowired
    WorkingDayService workingDayService;

//    public WorkingDayController (WorkingDayService workingDayService){
//        this.workingDayService = workingDayService;
//    }

    @PostMapping
    public WorkingDay createWorkingDay(@RequestBody WorkingDay workingDay) {
        return workingDayService.save(workingDay);
    }


}
