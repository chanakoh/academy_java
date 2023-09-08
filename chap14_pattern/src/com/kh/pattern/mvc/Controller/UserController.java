package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UserView;

public class UserController {

	private UserModel usermodel;
	private UserView userview;
	
	public UserController(UserModel usermodel, UserView userview ) {
		this.usermodel = usermodel;
		this.userview = userview;
	}
	
	
	public void setUserModel(UserModel model) {
		this.usermodel = usermodel;
	}
	public void setUserView(UserModel view) {
		this.userview = userview;
	}
	public UserView getUserView() {
		return userview;
	}
	public UserModel getUserModel() {
		return usermodel;
	}
	
		/*모델과 뷰를 연결하는곣
		 * 사용자 입력을 처리하는 곳
		 */
	
	
	}

