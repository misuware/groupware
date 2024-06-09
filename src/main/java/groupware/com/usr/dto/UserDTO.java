package groupware.com.usr.dto;

import groupware.com.usr.entity.User;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {
    private User user;
}
