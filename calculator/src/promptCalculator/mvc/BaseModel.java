package promptCalculator.mvc;


public abstract class BaseModel {
	
	BaseController controller;
	BaseView view;
	
	public void setController(BaseController aController) {
		this.controller = aController;
	}
	
	public void setView(BaseView aView) {
		this.view = aView;
	}
	
	//setController
	//setView
	
	
}
