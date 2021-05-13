package model.data_structures;

public class Edge<K extends Comparable<K>, V> implements Comparable<Edge<K, V>> {

	Vertex<K, V> origin;
	Vertex<K, V> destination;
	float weigth;

	public Edge(Vertex<K, V> origin, Vertex<K, V> destination, float weigth) {
		this.origin = origin;
		this.destination = destination;
		this.weigth = weigth;
	}

	public Vertex<K, V> getOrigin() {
		return origin;
	}

	public void setOrigin(Vertex<K, V> origin) {
		this.origin = origin;
	}

	public Vertex<K, V> getDestination() {
		return destination;
	}

	public void setDestination(Vertex<K, V> destination) {
		this.destination = destination;
	}

	public float getWeigth() {
		return weigth;
	}

	public void setWeigth(float weigth) {
		this.weigth = weigth;
	}

	@Override
	public int compareTo(Edge arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
