package com.dio.controleacesso.controller;

import com.dio.controleacesso.model.WorkingDay;
import com.dio.controleacesso.service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/working-day")
public class WorkingDayController {

    @Autowired
    WorkingDayService workingDayService;

    @PostMapping
    public WorkingDay createWorkingDay(@RequestBody WorkingDay workingDay) {
        return workingDayService.save(workingDay);
    }

    @GetMapping
    public List<WorkingDay> getWorkingDayList() {
        return workingDayService.findAll();
    }

    @GetMapping("/{workingDayId}")
    public ResponseEntity<WorkingDay> getWorkingDayById(@PathVariable("workingDayId") Long workingDayId) {
        Optional<WorkingDay> workingDay = workingDayService.getById(workingDayId);

        return workingDay
                .map(day -> new ResponseEntity<>(day, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.BAD_REQUEST));

    }

    @DeleteMapping("/{workingDayId}")
    public ResponseEntity<Object> deleteWorkingDayById(@PathVariable("workingDayId") Long workingDayId) {
        try {
            workingDayService.deleteById(workingDayId);
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            System.out.println(emptyResultDataAccessException.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
