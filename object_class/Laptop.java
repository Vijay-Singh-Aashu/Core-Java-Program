package object_class;

import java.util.Objects;

public class Laptop {
	int laptopId;
	String laptopName;
	double laptopPrice;

	public Laptop(int laptopId, String laptopName, double laptopPrice) {
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopPrice = laptopPrice;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", laptopPrice=" + laptopPrice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(laptopId, laptopName, laptopPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return laptopId == other.laptopId && Objects.equals(laptopName, other.laptopName)
				&& Double.doubleToLongBits(laptopPrice) == Double.doubleToLongBits(other.laptopPrice);
	}

}
