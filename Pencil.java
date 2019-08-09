package scope_demo2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;

@Configuration
@ActiveProfiles("cargraph")
@ConfigurationProperties(prefix="cardesign.pencil")
public class Pencil {
	private int length;
	private String brand;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Pencil [length=" + length + ", brand=" + brand + "]";
	}
	
}
