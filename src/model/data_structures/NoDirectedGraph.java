package model.data_structures;

public class NoDirectedGraph<K extends Comparable<K>, V extends Comparable<V>> implements IGraph<K, V> {
	
	private ITablaSimbolos<K, Vertex<K,V>> vertices;

	public NoDirectedGraph(int i) {
		vertices = new TablaHashLinearProbing<K, Vertex<K,V>>(i);
	}

	@Override
	public void incertVertex(K id, V value) {
		Vertex<K,V> vertex = new Vertex<>(id,value);
		vertices.put(id, vertex);
	}
	
	@Override
	public void addEdge(K id1, K id2, float w) {
		Vertex<K,V> origin = vertices.get(id1);
		Vertex<K,V> destination = vertices.get(id2);
		Edge<K,V> edge = new Edge<>(origin, destination, w);
		origin.addEdge(edge);

		Edge<K,V> edge2 = new Edge<>(destination, origin, w);
		destination.addEdge(edge2);
	}
	

	public void dfs(K id) {
		Vertex<K,V> vertex = vertices.get(id);
		vertex.dfs(null);
	}

}
