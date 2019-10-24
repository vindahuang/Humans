
public class Female extends HumanProperty {

	private String boyfriend;
	private boolean arisan;
	
	public Female() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Female(int height, int weight, String boyfriend, boolean arisan) {
		super(height, weight);
		this.boyfriend = boyfriend;
		this.arisan = arisan;
	}

	public Female(String boyfriend, boolean arisan) {
		super();
		this.boyfriend = boyfriend;
		this.arisan = arisan;
	}

	public String getBoyfriend() {
		return boyfriend;
	}

	public void setBoyfriend(String boyfriend) {
		this.boyfriend = boyfriend;
	}

	public boolean isArisan() {
		return arisan;
	}

	public void setArisan(boolean arisan) {
		this.arisan = arisan;
	}

	@Override
	public void height_category() {
		if(this.getHeight() >= 161){
			this.setHeightCategory("Above average / Average");
		}
		else{
			this.setHeightCategory("Below average");
		}
		// TODO Auto-generated method stub
	}
	
	
}
