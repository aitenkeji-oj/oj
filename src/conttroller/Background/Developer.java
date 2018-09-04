package conttroller.Background;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Dev_User;
import service.AppaDmin;

@Controller
public class Developer {	
	/**
	 * ѡ��ҳ��
	 * @return
	 */
	@RequestMapping("/dev/login")
	public String Page(){
		 
		return "devlogin";
	}
	/**
	 * service��
	 */
	@Autowired
	public AppaDmin ad;
	
	public AppaDmin getAd() {
		return ad;
	}

	public void setAd(AppaDmin ad) {
		this.ad = ad;
	}
	/**
	 * �����ߵ�½
	 * @return
	 */
	@RequestMapping(value="/dev/dologin")
	public String load(HttpServletRequest request,HttpServletResponse response,HttpSession Session){
		 String devCode=request.getParameter("devCode");  //�˻�
		 String devPassword=request.getParameter("devPassword");  //����
		 System.out.println(devCode+"-"+devPassword);
 		 Dev_User du=ad.select_User(devCode, devPassword);
 		 int i=ad.select_pwd(devPassword);
 		 System.out.println("��ǰi��ֵ"+i);
 		 int j=ad.select_Code(devCode);
 		 if(j==0){
 			 request.setAttribute("error","�˻�������!");
 			 return "devlogin";
 		 }
 		 if(i==0){
 			 request.setAttribute("error","�������!");
 			 return "devlogin";
 		 }
 		 if(du!=null||du.getDevName()!=""){
 			 Session.setAttribute("devUserSession", du);
		     return "developer/main";
 		 }
		 return "devlogin";   
	}
}
