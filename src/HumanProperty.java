
public abstract class HumanProperty {

	private int height, weight;
	
	private String heightCategory;
	
	public HumanProperty() {
		
	}

	public HumanProperty(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getHeightCategory() {
		return heightCategory;
	}

	public void setHeightCategory(String heightCategory) {
		this.heightCategory = heightCategory;
	}

	public abstract void height_category();

}
