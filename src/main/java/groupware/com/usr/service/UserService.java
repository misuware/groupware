package groupware.com.usr.service;

import groupware.com.usr.dto.UserDTO;
import groupware.com.usr.entity.User;

public interface UserService {
    public void signUp(User paramVO);
    public boolean signIn(User paramVO);
    public UserDTO getUserInfo(User paramVO);
}
