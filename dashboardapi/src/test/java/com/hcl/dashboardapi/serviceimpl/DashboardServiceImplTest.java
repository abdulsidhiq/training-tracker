package com.hcl.dashboardapi.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class DashboardServiceImplTest {

	@Autowired
	private DashboardService dashboardService;
	@BeforeEach
	void setUp() throws Exception {
		this.dashboardService=new DashboardServiceImpl();
	}

	@Test
	void test_givenEmployeeAsStringAndIdAsLong_ShouldReturnAllTranings() {
		Long trainings=dashboardService.getAllTraining("employee", (long) 1);
		assertEquals(trainings, 0);
	}

}
