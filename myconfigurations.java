package scope_demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class myconfigurations implements ApplicationContextAware{
	Logger log = LoggerFactory.getLogger(myconfigurations.class);
	
	private static ApplicationContext applicationcontext;
	@Autowired
	private Designer designer;
	
	@Bean(name="money")
	public Money money(){
		log.info("正在造钱单例的钱");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Money money = new Money(100);
		return money;
	}
	
	@Bean
	public Designgraph designgraph(){
		log.info("designgraph():thread:{}",Thread.currentThread());
		String graph = designer.designcar();
		Designgraph designgraph = new Designgraph();
		designgraph.setGraph(graph);
		return designgraph;
	}
	
	@Bean(name = "car")  
    @Scope("prototype")
    public Car car() {  
		log.info("car():thread:{}",Thread.currentThread());
		Car car = new Car();
		car.setName("dazhong");
		car.setDg(designgraph());
		return car;
    }

	@Override
	public void setApplicationContext(ApplicationContext actx) throws BeansException {
		// TODO Auto-generated method stub
		applicationcontext=actx;
	}  
	public static Object getBean(String name) throws BeansException {
        return applicationcontext.getBean(name);
    }

}
