package com.mploed.dddwithspring.creditsalesfunnel.model.applicant;

public enum MartialStatus {
	SINGLE("Single"),
	MARRIED("Married"),
	DIVORCED("Divorced"),
	WIDOWED("Widowed");

	private final String displayName;

	MartialStatus(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}
