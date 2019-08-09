package scope_demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class testscope {
	Logger log = LoggerFactory.getLogger(testscope.class);
	
	@Autowired Boss boss;
	
    @Test
    public void teststaticctx(){
    	Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//boss买车
				log.info("testscope:thread:{}",Thread.currentThread());
				System.out.println(boss.seegrapth());
		    	Car car1 = (Car)myconfigurations.getBean("car");
		    	Car car2 = (Car)myconfigurations.getBean("car");
		    	System.out.println("boss buy:"+car1.getcontent());
		    	System.out.println("boss buy:"+car2.getcontent());
		    	try {
		    		log.info("boss sleep...:thread:{}",Thread.currentThread());
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	System.out.println("boss wake up");
		    	Car car3 = (Car)myconfigurations.getBean("car");
		    	System.out.println("boss buy:"+car3.getcontent());
			}
		});
    	th.start();
    	//you买车
    	Money money = (Money)myconfigurations.getBean("money");
    	System.out.println("you get money:count:"+money.getCount());
    	Car car0 = (Car)myconfigurations.getBean("car");
    	System.out.println("you buy:"+car0.getcontent());
    	
    	try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
}
