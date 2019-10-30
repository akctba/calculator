package promptCalculator.mvc;


public abstract class BaseView {
	
	BaseModel model;
	
	BaseController controller;
	
	public void setModel(BaseModel aModel) {
		this.model = aModel;
	}
	
	public void setController(BaseController aController) {
		this.controller = aController;
	}

}
