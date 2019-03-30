package application;

public class GraphNodeIM<T> {

	public T data; 
	public IncidenceMatrix mat; 
	public int nodeId; 
	 
	public GraphNodeIM(T data,IncidenceMatrix mat){ 
		this.data=data; 
	    this.mat=mat; mat.nodes[nodeId=mat.nodeCount++]=this; //Add node to incidence matrix and record id 
	} 
	
	 
	public void connectToNode(GraphNodeIM<T> destNode) { //Set two entries in column to true to connect nodes 
		mat.imat[nodeId][mat.edgeCount]=mat.imat[destNode.nodeId][mat.edgeCount++]=true; 
	}
	
}
