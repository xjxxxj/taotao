package com.taotao.mapper;

import com.taotao.model.User;
import com.taotao.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);
    /**
      * 根据账号密码获取用户
     * @Title：selectByUsernameAndPassWord
     * @Description:TODO
     * @param 
     * @return User
     * @throws 
     *
     */
    User selectByUsernameAndPassWord(String username , String password) ;
    /**
     * 根据账号获取用户
     * @Title：selectByUsername
     * @Description:TODO
     * @param 
     * @return List<User>
     * @throws 
     *
     */
    List<User> selectByUsername(String username) ;
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}