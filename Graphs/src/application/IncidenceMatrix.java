package application;

import java.lang.reflect.Array;

public class IncidenceMatrix<T> {
	
	public boolean[][] imat;  
	public GraphNodeIM<?>[] nodes; 
	public int nodeCount=0, edgeCount=0; 
	 
	public IncidenceMatrix(int size){ 
		imat = new boolean [size][(size*(size-1))/2]; //All false values by default.     //Support max edges for a potential complete graph. 
		nodes = (GraphNodeIM<?>[]) Array.newInstance(GraphNodeIM.class, size); 
	}

}
