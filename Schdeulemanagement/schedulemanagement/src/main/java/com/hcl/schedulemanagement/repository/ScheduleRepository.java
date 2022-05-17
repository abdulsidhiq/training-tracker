package com.hcl.schedulemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.schedulemanagement.domain.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule,Long> {
	
		 

	}

