package com.vm.graphalgorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Graph<T> {
	
	
	
	private Map<Long, Vertex<T>> allVertices;
	private List<Edge<T>> allEdges;
	
	
	
	public Graph() {
		super();
		allVertices = new HashMap<Long, Vertex<T>>();
		allEdges = new ArrayList<Edge<T>>();
	}


	public void addEdge(long v1, long v2, int weight) {
		Vertex<T> vertex1 = null, vertex2 = null;
		if(allVertices.containsKey(v1)){
			vertex1 = allVertices.get(v1);
		}else{
			vertex1 = new Vertex<T>(v1);
			allVertices.put(v1, vertex1);
		}
		
		
		if(allVertices.containsKey(v2)){
			vertex2 = allVertices.get(v2);
		}else{
			vertex2 = new Vertex<T>(v2);
			allVertices.put(v2, vertex2);
		}
		
		Edge<T> e = new Edge(vertex1, vertex2, weight);
		vertex1.addAdjacentVertex(e, vertex2);
		allEdges.add(e);
		
	}

	public void addEdge(long v1, long v2) {
		addEdge(v1, v2, 0);
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(Edge<T> edge : getAllEdges()){
			builder.append(edge.getStartVertex()+ " " + edge.getEndVertex() + " " + edge.getWeight());
			builder.append("\n");
        }
        return builder.toString();
		
	}



	private List<Edge<T>> getAllEdges() {
		// TODO Auto-generated method stub
		return allEdges;
	}
	
	
	
	public static void main(String[] args) {
		Graph<Integer> graph = new Graph<Integer>();
		graph.addEdge(1, 3);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);
        graph.addEdge(5, 6);
        graph.addEdge(6, 3);
        graph.addEdge(3, 8);
        graph.addEdge(8, 11);
        System.out.println(graph);
	}


	public Collection<Vertex<T>> getAllVertices() {
		return allVertices.values();
	}
	
}

class Vertex<T> {
	private long id;
	private T data;
	private List<Vertex<T>> adjacentVertex = new ArrayList<Vertex<T>>();
	private List<Edge<T>> edges =  new ArrayList<Edge<T>>();
	
	public Vertex(long id) {
		super();
		this.id = id;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @return the adjacentVertex
	 */
	public List<Vertex<T>> getAdjacentVertex() {
		return adjacentVertex;
	}

	/**
	 * @return the edges
	 */
	public List<Edge<T>> getEdges() {
		return edges;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public void addAdjacentVertex(Edge<T> e, Vertex<T> v) {
		this.adjacentVertex.add(v);
		this.edges.add(e);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return String.valueOf(id);
	}
	
	
	
}

class Edge<T> {
	private Vertex<T> startVertex;
	private Vertex<T> endVertex;
	private int weight;
	
	public Edge(Vertex<T> startVertex, Vertex<T> endVertex, int weight) {
		super();
		this.startVertex = startVertex;
		this.endVertex = endVertex;
		this.weight = weight;
	}

	public Vertex<T> getStartVertex() {
		return startVertex;
	}

	public Vertex<T> getEndVertex() {
		return endVertex;
	}

	public int getWeight() {
		return weight;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endVertex == null) ? 0 : endVertex.hashCode());
		result = prime * result + ((startVertex == null) ? 0 : startVertex.hashCode());
		result = prime * result + weight;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		if (endVertex == null) {
			if (other.endVertex != null)
				return false;
		} else if (!endVertex.equals(other.endVertex))
			return false;
		if (startVertex == null) {
			if (other.startVertex != null)
				return false;
		} else if (!startVertex.equals(other.startVertex))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Edge [startVertex=");
		builder.append(startVertex);
		builder.append(", endVertex=");
		builder.append(endVertex);
		builder.append(", weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}
	
	
}

