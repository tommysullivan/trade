import java.util.List;


public class Trader {
	private final String name;
	private final List<Good> goods;
	
	public Trader(String name, List<Good> goods) {
		this.name = name;
		this.goods = goods;
	}
	
	public String name() {
		return name;
	}
	
	public List<Good> goods() {
		return goods;
	}
	
	public String toString() {
		return "Trader named "+name();
	}
}
