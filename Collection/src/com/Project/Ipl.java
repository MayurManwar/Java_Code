package com.Project;

public class Ipl {

	private int teamId;

	private String TeamName;

	private String TeamState;

	private int cupWin;

	private int TotalMatches;
	
	private String CaptainName;
	
	
public String getCaptainName() {
		return CaptainName;
	}

	public void setCaptainName(String captainName) {
		CaptainName = captainName;
	}

public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	public String getTeamState() {
		return TeamState;
	}

	public void setTeamState(String teamState) {
		TeamState = teamState;
	}

	public int getCupWin() {
		return cupWin;
	}

	public void setCupWin(int cupWin) {
		this.cupWin = cupWin;
	}

	public int getTotalMatches() {
		return TotalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		TotalMatches = totalMatches;
	}

	@Override
	public String toString() {
		return "Ipl [teamId=" + teamId + ", TeamName=" + TeamName + ", TeamState=" + TeamState + ", cupWin=" + cupWin
				+ ", TotalMatches=" + TotalMatches + ", CaptainName=" + CaptainName + "]";
	}

	

}
