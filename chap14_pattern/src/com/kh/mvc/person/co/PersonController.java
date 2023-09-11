package com.kh.mvc.person.co;

import com.kh.mvc.person.mo.PersonModel;
import com.kh.mvc.person.vo.PersonView;

public class PersonController {
	private PersonModel model;
	private PersonView view;
	public PersonController(PersonModel model , PersonView view) {
		this.model = model;
		this.view = view;
		
	}
	
	public void setPersonname(String name) {
		model.setName(name);
	}
	public void setPersonage(int number) {
		model.setNumber(number);
		
	}
	
	public String getPersonname() {
		return model.getName();
	}
	public int getPersonage() {
		return model.getNumber();
	}
	public void displaye() {
		view.Display(getPersonname(),getPersonage());

}
}
