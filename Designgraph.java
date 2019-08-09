package scope_demo2;

import org.springframework.stereotype.Component;

//一个设计图纸可以造很多车

public class Designgraph {
	private String graph = "car graph";
	public String Designcar(){
		return "benz"+graph;
	}
	public String getGraph() {
		return graph;
	}
	public void setGraph(String graph) {
		this.graph = graph;
	}
	
}
