package groupware.com.usr.controller;

import groupware.com.usr.dto.UserDTO;
import groupware.com.usr.service.UserService;
import groupware.com.usr.entity.User;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final HttpServletResponse httpServletResponse;

    @PostMapping("/signUp")
    @ResponseBody
    public void signUp(@RequestBody User paramVO) {
        userService.signUp(paramVO);
    }

    @PostMapping("/signIn")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> signIn(@RequestBody User paramVO) {
        Map<String, Object> map = new HashMap<>();
        if (userService.signIn(paramVO)) {
            map.put("message", "로그인 성공");
            map.put("user", userService.getUserInfo(paramVO));
            return new ResponseEntity<>(map, HttpStatus.OK);
        } else {
            map.put("message", "로그인 실패");
            return new ResponseEntity<>(map, HttpStatus.UNAUTHORIZED);
        }
    }
}
