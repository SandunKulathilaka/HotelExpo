package bo.custom;

import bo.SuperBo;
import dto.UserDto;

public interface UserBo extends SuperBo {
    public boolean createUser (UserDto dto);
}
