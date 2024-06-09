package groupware.com.usr.entity;

import lombok.Data;

@Data
public class User {
    private String userId;
    private String rawPassword;
    private String hashedPassword;
    private String userNm;
    private String userDc;
    private String authCd;
    private String authNm;
    private String userGid;
}
