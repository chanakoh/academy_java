package com.kh.mvc.circle.mo;

import com.kh.mvc.circle.me.CircleModel;
import com.kh.mvc.circle.vo.CircleView;

public class CircleController {
	private CircleModel model;
	private CircleView view;
	
	public CircleController(CircleModel model, CircleView view) {
		this.model = model;
		this.view = view;
	}
	public void run() {
		double userInput = view.getCircleInput();
		int userInput2 = view.getCircleInput2();
		int radious = (int)(userInput*userInput2*userInput2);
		view.display(radious);
	}
		
	}
