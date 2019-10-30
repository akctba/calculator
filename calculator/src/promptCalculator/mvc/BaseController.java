package promptCalculator.mvc;

public abstract class BaseController {
	
	BaseModel model;
	BaseView view;
	
	public void setModel(BaseModel aModel) {
		this.model = aModel;
	}
	
	public void setView(BaseView aView) {
		this.view = aView;
	}

}
