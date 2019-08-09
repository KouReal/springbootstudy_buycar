package scope_demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("money")
public class Boss {
	@Autowired Designgraph designgraph;
	
	public String seegrapth(){
		return "boss see : "+designgraph.getGraph();
	}
}
