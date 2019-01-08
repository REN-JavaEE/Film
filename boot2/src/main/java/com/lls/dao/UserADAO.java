package com.lls.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lls.entity.UserA;

public interface UserADAO {
	@Insert("insert into usera values(#{qq},#{userName},#{password},#{gender,jdbcType=VARCHAR},#{age,jdbcType=INTEGER},#{realName,jdbcType=VARCHAR},#{headPhoto,jdbcType=VARCHAR})")
	public void setUserA(UserA userA);
	@Select("select * from usera where qq=#{qq} and password=#{password}")
	public UserA getUserByQQAndPassword(@Param("qq") String qq,@Param("password") String password);
	@Select("select * from usera where qq=#{qq}")
	public UserA getUserByQQ(String qq);

}
