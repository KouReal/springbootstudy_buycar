package scope_demo2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;

@Configuration
@ActiveProfiles("cargraph")
@ConfigurationProperties(prefix="cardesign.paper")
public class Paper {
	private String color;
	private int count;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Paper [color=" + color + ", count=" + count + "]";
	}
	
}
