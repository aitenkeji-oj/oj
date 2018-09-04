package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Dev_User;

/**
 * 接口
 * @author Administrator
 *
 */
public interface AppDao {
    /**
     * 蒋克文2018-09-04
     * 用户登陆
     * @param name
     * @param pwd
     * @return
     */
	public Dev_User select_User(@Param("name") String name,@Param("pwd") String pwd);


    
   /**
    * 蒋克文2018-09-04
    * 判断密码是否正确
    */
	public int select_pwd(@Param("pwd1") String pwd1);
	
	/**
	 * 蒋克文2018-09-04
	 * 判断账户是否正确
	 */
    public int select_Code(@Param("Code") String Code);
}
