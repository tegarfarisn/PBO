package kasus2;

public class Item {
	public String name;
	private Item() {
		name = "Ipin";
	}
	public Item(String name) {
		this();
		System.out.println(this.name);
	}
}
