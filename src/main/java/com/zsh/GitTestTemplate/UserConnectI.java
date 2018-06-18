package com.zsh.GitTestTemplate;

public interface UserConnectI {
	
	public String getUserInfo(String userId)throws Exception;
	public String userRegister(String userName,String passwd,String phoneNum)throws Exception;

}
