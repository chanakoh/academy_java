package com.kh.calculatorMVC;
import com.kh.calculatorMVC.CalculatorController;
public class Main {

	public static void main(String[] args) {
		// model view controller
		//model = CalculatorModel 가져오기
		//view = CalculatorView 가져오기
		//Controller CalculatorController 가졍괴
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		CalculatorController Controller = new CalculatorController(model, view);
		
		Controller.run();

	}

}
