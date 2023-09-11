package com.kh.mvc.person.cl;

import com.kh.mvc.person.co.PersonController;
import com.kh.mvc.person.mo.PersonModel;
import com.kh.mvc.person.vo.PersonView;

public class PersonMain {

		public static void main(String[] args) {
			PersonModel model = new PersonModel("°íº´Âù",20);
			PersonView view = new PersonView();
			PersonController controller = new PersonController(model,view);
			
			controller.displaye();
			controller.setPersonname("");
			controller.setPersonage(40);
			controller.displaye();
		}

}
