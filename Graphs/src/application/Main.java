package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
		// Adjacency List
		/* GraphNodeAL<String> a=new GraphNodeAL<>("Cherry"); 
		GraphNodeAL<String> b=new GraphNodeAL<>("Apple"); 
		GraphNodeAL<String> c=new GraphNodeAL<>("Plum"); 
		GraphNodeAL<String> d=new GraphNodeAL<>("Mango"); 
		GraphNodeAL<String> e=new GraphNodeAL<>("Kiwi"); 
		GraphNodeAL<String> f=new GraphNodeAL<>("Coconut");
		GraphNodeAL<String> g=new GraphNodeAL<>("Pear"); 
		GraphNodeAL<String> h=new GraphNodeAL<>("Orange"); 
		 
		a.connectToNodeUndirected(b); //Pairs either way to connect undirected 
		a.connectToNodeUndirected(c); 
		b.connectToNodeUndirected(c); 
		b.connectToNodeUndirected(g); 
		c.connectToNodeUndirected(d); 
		g.connectToNodeUndirected(e); 
		d.connectToNodeUndirected(e); 
		f.connectToNodeUndirected(e); 
		e.connectToNodeUndirected(h); */
		
		// Adjacency Matrix
		/* AdjacencyMatrix am=new AdjacencyMatrix(8); //Room for 8 nodes (could use larger!) 
		 
		GraphNodeAM<String> a=new GraphNodeAM<>("Cherry",am); 
		GraphNodeAM<String> b=new GraphNodeAM<>("Apple",am); 
		GraphNodeAM<String> c=new GraphNodeAM<>("Plum",am); 
		GraphNodeAM<String> d=new GraphNodeAM<>("Mango",am); 
		GraphNodeAM<String> e=new GraphNodeAM<>("Kiwi",am); 
		GraphNodeAM<String> f=new GraphNodeAM<>("Coconut",am); 
		GraphNodeAM<String> g=new GraphNodeAM<>("Pear",am); 
		GraphNodeAM<String> h=new GraphNodeAM<>("Orange",am); 
		 
		a.connectToNodeUndirected(b); //Pairs either way to connect undirected 
		a.connectToNodeUndirected(c); 
		b.connectToNodeUndirected(c); 
		b.connectToNodeUndirected(g); 
		c.connectToNodeUndirected(d); 
		g.connectToNodeUndirected(e); 
		d.connectToNodeUndirected(e); 
		f.connectToNodeUndirected(e); 
		e.connectToNodeUndirected(h); */
		
		// Incidence Matrix
		IncidenceMatrix im=new IncidenceMatrix(8); //Room for 8 nodes (could use larger!) 
		 
		GraphNodeIM<String> a=new GraphNodeIM<>("Cherry",im); 
		GraphNodeIM<String> b=new GraphNodeIM<>("Apple",im); 
		GraphNodeIM<String> c=new GraphNodeIM<>("Plum",im); 
		GraphNodeIM<String> d=new GraphNodeIM<>("Mango",im); 
		GraphNodeIM<String> e=new GraphNodeIM<>("Kiwi",im); 
		GraphNodeIM<String> f=new GraphNodeIM<>("Coconut",im); 
		GraphNodeIM<String> g=new GraphNodeIM<>("Pear",im); 
		GraphNodeIM<String> h=new GraphNodeIM<>("Orange",im); 
		 
		a.connectToNode(b); //Incidence matrix -> undirected graph 
		a.connectToNode(c); 
		b.connectToNode(c); 
		b.connectToNode(g); 
		c.connectToNode(d); 
		g.connectToNode(e); 
		d.connectToNode(e); 
		f.connectToNode(e); 
		e.connectToNode(h); 
		
	}
}
