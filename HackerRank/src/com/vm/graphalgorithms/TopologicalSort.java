package com.vm.graphalgorithms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class TopologicalSort<T> {

	private Set<Vertex<T>> visitedSet;
	private Stack<Vertex<T>> sortedStack;

	public TopologicalSort() {
		super();
		visitedSet = new HashSet<>();
		sortedStack = new Stack<>();
	}

	public void sortUtil(Vertex<T> vertex) {
		visitedSet.add(vertex);
		List<Vertex<T>> adjVertices = vertex.getAdjacentVertex();
		for (Vertex<T> adjVertex : adjVertices) {
			if (visitedSet.contains(adjVertex)) {
				continue;
			}
			sortUtil(adjVertex);
		}
		sortedStack.push(vertex);
	}

	public void sort(Graph<T> graph) {
		
		for (Vertex<T> v : graph.getAllVertices()) {
			if (visitedSet.contains(v)) {
				continue;
			}
			sortUtil(v);
		}
		printSortedStack();
	}

	private void printSortedStack() {
		while (!sortedStack.isEmpty())
			System.out.println(sortedStack.pop());

	}

	public static void main(String[] args) {
		Graph<Integer> graph = new Graph<>();
		graph.addEdge(1, 3);
		graph.addEdge(1, 2);
		graph.addEdge(3, 4);
		graph.addEdge(5, 6);
		graph.addEdge(6, 3);
		graph.addEdge(3, 8);
		graph.addEdge(8, 11);
		
		TopologicalSort<Integer> t = new TopologicalSort<>();
		t.sort(graph);
		
	}
}
