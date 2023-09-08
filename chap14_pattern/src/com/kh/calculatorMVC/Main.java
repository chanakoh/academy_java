package com.kh.calculatorMVC;
import com.kh.calculatorMVC.CalculatorController;
public class Main {

	public static void main(String[] args) {
		// model view controller
		//model = CalculatorModel ��������
		//view = CalculatorView ��������
		//Controller CalculatorController ������
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		CalculatorController Controller = new CalculatorController(model, view);
		
		Controller.run();

	}

}
