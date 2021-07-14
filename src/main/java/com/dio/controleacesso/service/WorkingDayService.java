package com.dio.controleacesso.service;

import com.dio.controleacesso.model.WorkingDay;
import com.dio.controleacesso.repository.WorkingDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public WorkingDay update(WorkingDay workingDay) {
        return workingDayRepository.save(workingDay);
    }

    public void deleteById(Long workingDayId) {
        workingDayRepository.deleteById(workingDayId);
    }

    public List<WorkingDay> findAll() {
        return workingDayRepository.findAll();
    }

    public Optional<WorkingDay> getById(Long workingDayId) {
        return workingDayRepository.findById(workingDayId);
    }
}
