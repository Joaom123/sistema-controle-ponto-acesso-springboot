package com.dio.controleacesso.repository;

import com.dio.controleacesso.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkingDayRepository extends JpaRepository<WorkingDay, Long> {
}
