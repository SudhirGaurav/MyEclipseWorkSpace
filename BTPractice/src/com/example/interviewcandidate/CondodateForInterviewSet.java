package com.example.interviewcandidate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CondodateForInterviewSet {

	public static void main(String[] args) {

		Candidate c1 = new Candidate("Sudhir", "121345", true, 2f, "java", Arrays.asList("cisco","Velankani"));
		Candidate c2 = new Candidate("Gaurav", "121345", true, 2f, "java", Arrays.asList("cisco","Velankani"));
		
		Set<Candidate> condidates= new HashSet<Candidate>();
		condidates.add(c1);
		condidates.add(c2);
		

		System.out.println(condidates.size());
		for (Candidate candidate : condidates) {
			System.out.println(candidate.toString());
			
		}
	
		Map<String, Integer> map =  new HashMap<String, Integer>();
		map.put("1", 1);
		map.put("1", 3);
		map.put("1", 5);
		System.out.println(map);
		
	}

}
