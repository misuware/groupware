package groupware.com.usr.service;

import groupware.com.usr.dto.UserDTO;
import groupware.com.usr.mapper.UserMapper;
import groupware.com.usr.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    @Override
    public void signUp(User paramVO) {
        if (paramVO.getRawPassword() != null && paramVO.getRawPassword().length() > 0) {
            paramVO.setHashedPassword(passwordEncoder.encode(paramVO.getRawPassword()));
            userMapper.insertUser(paramVO);
            userMapper.insertUserInfo(paramVO);
        }
    }

    @Override
    public boolean signIn(User paramVO) {
        if (paramVO.getRawPassword() != null && paramVO.getRawPassword().length() > 0) {
            User user = userMapper.selectUser(paramVO);
            if (passwordEncoder.matches(paramVO.getRawPassword(), user.getHashedPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public UserDTO getUserInfo(User paramVO) {
        UserDTO userDTO = UserDTO.builder()
                .user(userMapper.selectUserInfo(paramVO))
                .build();

        return userDTO;
    }
}
