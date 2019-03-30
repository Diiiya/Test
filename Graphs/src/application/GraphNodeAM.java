package application;

public class GraphNodeAM<T> {
	
	public T data; 
	
	public AdjacencyMatrix mat; 
	
	public int nodeId; 
	 
	public GraphNodeAM(T data,AdjacencyMatrix mat){ this.data=data; this.mat=mat; mat.nodes[nodeId=mat.nodeCount++]=this; } //Add this node to adjacency matrix and record id 
	 
	public void connectToNodeDirected(GraphNodeAM<T> destNode) { mat.amat[nodeId][destNode.nodeId]=true; } 
	 
	public void connectToNodeUndirected(GraphNodeAM<T> destNode) { mat.amat[nodeId][destNode.nodeId]=mat.amat[destNode.nodeId][nodeId]=true; }

}
