package com.vm.codejam.practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class SavingUniverse {

	public SavingUniverse() {
		// TODO Auto-generated constructor stub
	}

	static Scanner sc = new Scanner(System.in);

	private String[] searchEngine;
	private String[] queries;
	private HashMap<String, Integer> querySearchMap = new HashMap<String, Integer>();

	private void readCases() {
		int nCases = Integer.parseInt(sc.nextLine());
		searchEngine = new String[nCases];
		for (int i = 0; i < nCases; i++) {
			String s = sc.nextLine();
			searchEngine[i] = s;
			querySearchMap.put(s, 0);
		}
	}

	private void readQueries() {
		// TODO Auto-generated method stub
		int nQueries = Integer.parseInt(sc.nextLine());
		queries = new String[nQueries];
		for (int i = 0; i < nQueries; i++) {
			String quString = sc.nextLine();
			queries[i] = quString;
			querySearchMap.put(quString, querySearchMap.get(quString) + 1);
		}
	}

	private String findSearchEngine(String nextQuery, String prevEngine) {
		String engine = null;
		Set<String> searchEng = querySearchMap.keySet();
		/*searchEng.remove(nextQuery);
		searchEng.remove(prevEngine);*/
		int lowest = -1;
		for (String s : searchEng) {
			if(s.equals(nextQuery) || s.equals(prevEngine)){
				continue;
			}
			int count = querySearchMap.get(s);
			if(lowest ==-1 || count < lowest ){
				lowest = count;
				engine = s;
			}
			
		}
		System.out.println("Engine chosen:"+engine);
		return engine;

	}

	private void process(int caseno) {
		int switches = 0;
		String engine = null;
		// String prevEngine = null;
		for (int i = 0; i < queries.length; i++) {
			if (engine == null) {
				engine = findSearchEngine(queries[i], engine);
			}
			if(queries[i].equals(engine)){
				engine = findSearchEngine(queries[i], engine);
				switches++;
			}
			
		}
		
		System.out.printf("Case #%d: %d%n", caseno, switches);
		System.out.printf("***************************************************");
	}

	private void print() {
		System.out.println("Search Engines are :");
		for (String s : searchEngine) {
			System.out.println(s);
		}
		System.out.println("--------------------------");
		System.out.println("Queries are :");
		for (String s : queries) {
			System.out.println(s);
		}
		System.out.println("--------------------------");
		System.out.println("Map");
		Set<String> searchEng = querySearchMap.keySet();
		for (String s : searchEng) {
			System.out.println(s + " : " + querySearchMap.get(s));
		}
	}

	private void clear() {
		searchEngine = null;
		queries = null;
		querySearchMap.clear();
	}

	public static void main(String[] args) {
		SavingUniverse su = new SavingUniverse();

		int n = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= n; i++) {
			su.readCases();
			su.readQueries();
			su.print();// comment it while execution
			su.process(i);
			su.clear();
		}

		sc.close();
	}

}
