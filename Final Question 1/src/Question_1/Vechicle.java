package Question_1;

public abstract class Vechicle implements Vechicle_final{

	public String Name;
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String Color;
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public float Weight;
	public float getWeight() {
		return Weight;
	}

	public void setWeight(float weight) {
		Weight = weight;
	}

	public Person Owner;
	
	public Person getOwner() {
		return Owner;
	}

	public void setOwner(Person owner) {
		Owner = owner;
	}

	abstract void transferOwnership(Person newOwner);
	
	
}
