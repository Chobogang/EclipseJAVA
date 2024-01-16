package ch07;

public class GenericPrinter<T extends Meterial> { // Meterial을 상속 받은 타입만 받는다.

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
}
