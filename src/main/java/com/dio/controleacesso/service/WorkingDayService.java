package com.dio.controleacesso.service;

import com.dio.controleacesso.model.WorkingDay;
import com.dio.controleacesso.repository.WorkingDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkingDayService {

    WorkingDayRepository workingDayRepository;

    @Autowired
    public WorkingDayService(WorkingDayRepository workingDayRepository) {
        this.workingDayRepository = workingDayRepository;
    }

    public WorkingDay save(WorkingDay workingDay) {
        return workingDayRepository.save(workingDay);
    }
}
