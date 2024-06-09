package groupware.com.usr.mapper;

import groupware.com.usr.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public void insertUser(User paramVO);
    public void insertUserInfo(User paramVO);
    public User selectUser(User paramVO);
    public User selectUserInfo(User paramVO);
}
