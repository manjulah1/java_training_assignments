package com.cognologix.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.cognologix.entity.Candidate;

public class VotersInfo {

	public static void main(String[] args) {
		List<Candidate> candidateList = new ArrayList<Candidate>();
		//add candidates data
		candidateList = addCandidates();
		
		//get constituencies
		List<String> constituencyList = new ArrayList<String>();
		constituencyList = getConstitutiencies(candidateList);
		
		// find the id of candidate with highest votes in each constituency
		Map<String, Integer> responseList = new HashMap<String, Integer>();
		responseList = calcIdForHighestVotes(candidateList, constituencyList);
		
		System.out.println(responseList);
	}

	private static Map<String, Integer> calcIdForHighestVotes(List<Candidate> candidateList,
			List<String> constituencyList) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer highest = 0;
		Candidate highestVotedCandidate = null;
		for (Iterator iterator = constituencyList.iterator(); iterator.hasNext();) {
			String constituency = (String) iterator.next();
			for (Iterator iterator2 = candidateList.iterator(); iterator2.hasNext();) {
				Candidate candidate = (Candidate) iterator2.next();
				if(candidate.getConstituency().equalsIgnoreCase(constituency)) {
					if(candidate.getVotes() > highest) {
						highest = candidate.getVotes();
						highestVotedCandidate = candidate;
					}
				}
			}
			map.put(constituency, highestVotedCandidate.getCandidateId());
			highest = 0;
		}
		return map;
	}

	private static List<String> getConstitutiencies(List<Candidate> candidateList) {
		List<String> list = new ArrayList<String>();
		for (Iterator iterator = candidateList.iterator(); iterator.hasNext();) {
			Candidate candidate = (Candidate) iterator.next();
			if (list.contains(candidate.getConstituency()) == false) {
				list.add(candidate.getConstituency());
			}
		}
		return list;
	}

	private static List<Candidate> addCandidates() {
		List<Candidate> list = new ArrayList<Candidate>();
		Candidate candidate1 = new Candidate(22, "Ravi Pawar", "Aundh", 1603);
		Candidate candidate2 = new Candidate(23, "Suvarna Kale", "Baner", 803);
		Candidate candidate3 = new Candidate(27, "Vinod Chavan", "Aundh", 809);
		Candidate candidate4 = new Candidate(29, "Vasant Mahajan", "Aundh", 617);
		Candidate candidate5 = new Candidate(32, "Aarti Patil", "Baner", 351);
		Candidate candidate6 = new Candidate(34, "Swaran Bijur", "Baner", 352);

		list.add(candidate1);
		list.add(candidate2);
		list.add(candidate3);
		list.add(candidate4);
		list.add(candidate5);
		list.add(candidate6);

		return list;
	}

}
