package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dao.AppDao;
import entity.Dev_User;

public interface AppaDmin {
    /**
     * 开发者登陆
     * @param name
     * @param pwd
     * @return
     */
	public Dev_User select_User(String name,String pwd);
	
	
	  
	/**
	 * 判断密码是否正确
	 */
	public int select_pwd(String pwd);
	/**
	 * 蒋克文2018-09-04
	 * 判断账户是否正确
	 */
    public int select_Code(String Code);

}
