package application;

import java.lang.reflect.Array;

public class AdjacencyMatrix {

	public boolean[][] amat;  public GraphNodeAM<?>[] nodes; public int nodeCount=0; 
	 
	public AdjacencyMatrix(int size){ amat = new boolean [size][size]; //All false values by default 
	
	nodes = (GraphNodeAM<?>[]) Array.newInstance(GraphNodeAM.class, size); } 
	
	
}
