package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Dev_User;

/**
 * �ӿ�
 * @author Administrator
 *
 */
public interface AppDao {
    /**
     * ������2018-09-04
     * �û���½
     * @param name
     * @param pwd
     * @return
     */
	public Dev_User select_User(@Param("name") String name,@Param("pwd") String pwd);


    
   /**
    * ������2018-09-04
    * �ж������Ƿ���ȷ
    */
	public int select_pwd(@Param("pwd1") String pwd1);
	
	/**
	 * ������2018-09-04
	 * �ж��˻��Ƿ���ȷ
	 */
    public int select_Code(@Param("Code") String Code);
}
