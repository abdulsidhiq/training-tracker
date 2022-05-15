package com.hcl.dashboardapi.domain;

public class Dashboard {
	private Long totalTrainings;
	private Long totalTrainingHours;
	private String trainingStatus;
	private String trainingTypes;
	private Double budget;
	private Long trainingRating;
	public Long getTotalTrainings() {
		return totalTrainings;
	}
	public void setTotalTrainings(Long totalTrainings) {
		this.totalTrainings = totalTrainings;
	}
	public Long getTotalTrainingHours() {
		return totalTrainingHours;
	}
	public void setTotalTrainingHours(Long totalTrainingHours) {
		this.totalTrainingHours = totalTrainingHours;
	}
	public String getTrainingStatus() {
		return trainingStatus;
	}
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
	public String getTrainingTypes() {
		return trainingTypes;
	}
	public void setTrainingTypes(String trainingTypes) {
		this.trainingTypes = trainingTypes;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	public Long getTrainingRating() {
		return trainingRating;
	}
	public void setTrainingRating(Long trainingRating) {
		this.trainingRating = trainingRating;
	}
	public Dashboard() {
		super();
		
	}
	@Override
	public String toString() {
		return "Dashboard [totalTrainings=" + totalTrainings + ", totalTrainingHours=" + totalTrainingHours
				+ ", trainingStatus=" + trainingStatus + ", trainingTypes=" + trainingTypes + ", budget=" + budget
				+ ", trainingRating=" + trainingRating + "]";
	}

	
}
