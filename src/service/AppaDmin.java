package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dao.AppDao;
import entity.Dev_User;

public interface AppaDmin {
    /**
     * �����ߵ�½
     * @param name
     * @param pwd
     * @return
     */
	public Dev_User select_User(String name,String pwd);
	
	
	  
	/**
	 * �ж������Ƿ���ȷ
	 */
	public int select_pwd(String pwd);
	/**
	 * ������2018-09-04
	 * �ж��˻��Ƿ���ȷ
	 */
    public int select_Code(String Code);

}
