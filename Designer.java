package scope_demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Designer {
	private String caridea;
	
	@Autowired
	private Paper paper;
	
	@Autowired
	private Pencil pencil;
	private static Logger log = LoggerFactory.getLogger(Designer.class);
	public String designcar(){
		log.info("Designer get:{},{}",paper,pencil);
		try {
			log.info("Designer is drawing graph...thread:{}",Thread.currentThread());
			Thread.sleep(5000);
			caridea = "goodidea";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return caridea;
	}
}
