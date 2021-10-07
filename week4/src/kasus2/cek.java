package kasus2;
public class cek {
public static void main(String[] args) {
Item1 name1 = new Item1("upin");
name1.Item1();
}
}
class Item1 {
private String name;
private Item1() {
this.name = "Ipin";
}
public Item1(String name) {
System.out.println(this.name);
}
}
