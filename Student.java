package codessoftweek1;

public class Student {
	private String id;
	private String name;
	private int age;

	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// Getters and setters

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Age: " + age;
	}
}

