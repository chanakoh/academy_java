package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;

public class StudentController {
		private StudentModel studentmodel;
	//	private StudentView studentview;
		private StudentView studentview;
		
		
		public StudentController(StudentModel model, StudentView view){
			this.studentmodel = studentmodel;
			this.studentview = studentview;
			
			
		}

		public void setStudentName(String name) {
			studentmodel.setName(name);
		}
		public void setStudentAge(int Age) {
			studentmodel.setAge(Age);
		}
		public String getStudentName() {
			return studentmodel.getName();
		}
		public int getStudentAge( ) {
			return studentmodel.getAge();
		}
		public void updateView() {
			//DB에 변경될 값 추가
			studentview.displayInfor(getStudentName(), getStudentAge());
		}
}


