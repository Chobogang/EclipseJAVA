package ch07;

public class GenericPrinter<T extends Meterial> { // Meterial�� ��� ���� Ÿ�Ը� �޴´�.

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
