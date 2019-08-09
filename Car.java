package scope_demo2;

public class Car {
	private String name;
	private Designgraph dg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Designgraph getDg() {
		return dg;
	}
	public void setDg(Designgraph dg) {
		this.dg = dg;
	}
	public String getcontent(){
		
		return this+":"+name+dg.getGraph();
	}
	
}
