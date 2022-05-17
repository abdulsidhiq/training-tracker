package com.hcl.schedulemanagement.scheduleserviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.schedulemanagement.domain.Schedule;
import com.hcl.schedulemanagement.repository.ScheduleRepository;
import com.hcl.schedulemanagement.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	
		 

	    @Autowired
	    private ScheduleRepository scheduleRepository;
	   
		@Override
		public Schedule getScheduleById(Long employeeid) {
			// TODO Auto-generated method stub
			return scheduleRepository.getById(employeeid);
		}
		@Override
		public void deleteScheduleById(Long employeeid) {
			// TODO Auto-generated method stub
			
			
		}
		@Override
		public List<Schedule> getAllSchedule() {
			// TODO Auto-generated method stub
			return scheduleRepository.findAll();
		}
		@Override
		public Schedule updateSchedule(Schedule schedule, Long employeeid) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Schedule createSchedule(Schedule schedule) {
			// TODO Auto-generated method stub
			return null;
		}}

