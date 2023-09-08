package com.kh.mvc.circle.co;

import com.kh.mvc.circle.me.CircleModel;
import com.kh.mvc.circle.mo.CircleController;
import com.kh.mvc.circle.vo.CircleView;

public class CircleMain {

	public static void main(String[] args) {
		
		CircleModel model = new CircleModel();
		CircleView view = new CircleView();
		CircleController Controller = new CircleController(model, view);
		
		Controller.run();
		
		
	}

}
