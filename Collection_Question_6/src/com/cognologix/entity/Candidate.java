package com.cognologix.entity;

public class Candidate {
	private Integer CandidateId;
	private String CandidateName;
	private String Constituency;
	private Integer Votes;
	public Candidate(Integer candidateId, String candidateName, String constituency, Integer votes) {
		super();
		CandidateId = candidateId;
		CandidateName = candidateName;
		Constituency = constituency;
		Votes = votes;
	}
	public Integer getCandidateId() {
		return CandidateId;
	}
	public void setCandidateId(Integer candidateId) {
		CandidateId = candidateId;
	}
	public String getCandidateName() {
		return CandidateName;
	}
	public void setCandidateName(String candidateName) {
		CandidateName = candidateName;
	}
	public String getConstituency() {
		return Constituency;
	}
	public void setConstituency(String constituency) {
		Constituency = constituency;
	}
	public Integer getVotes() {
		return Votes;
	}
	public void setVotes(Integer votes) {
		Votes = votes;
	}
	
	
}
