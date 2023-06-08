package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import share.ShareClass;

public class ListAction2 implements Controller {
	private ShareClass shareClass;
	

	public void setShareClass(ShareClass shareClass) {
		this.shareClass = shareClass;
	}



	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ListAction2() 호출");
		
		System.out.println("shareClass: " + shareClass);
		System.out.println("shareData2: " + shareClass.getShareData1());
		
		shareClass.setShareData1("난 listaction2에서 변경된 데이터");
	
		return new ModelAndView("listview2");
	}

}
