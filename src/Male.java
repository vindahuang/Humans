
public class Male extends HumanProperty {
	
	private String girlfriend;
	private boolean conscript;
	
	public Male() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Male(int height, int weight, String girlfriend, boolean conscript) {
		super(height, weight);
		this.girlfriend = girlfriend;
		this.conscript = conscript;
	}


	public Male(String girlfriend, boolean conscript) {
		super();
		this.girlfriend = girlfriend;
		this.conscript = conscript;
	}


	public String getGirlfriend() {
		return girlfriend;
	}

	public void setGirlfriend(String girlfriend) {
		this.girlfriend = girlfriend;
	}

	public boolean isConscript() {
		return conscript;
	}

	public void setConscript(boolean conscript) {
		this.conscript = conscript;
	}
	
	@Override
	public void height_category() {
		if(this.getHeight() >= 168){
			this.setHeightCategory("Above average / Average");
		}
		else{
			this.setHeightCategory("Below average");
		}
		// TODO Auto-generated method stub
	}

}
