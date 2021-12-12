package com.ertugrul.applications;

import com.ertugrul.dto.UserActionDto;
import com.ertugrul.entityservice.UserEntityService;

import java.util.List;

//4. Bir kullanıcının yapmış olduğu yorumları listeleyen bir metot
public class DtoUserActionApp {
    public static void main(String[] args) {

        UserEntityService service = new UserEntityService();
        List<UserActionDto> userActionDtoList = service.findUserCommentsByUserId(1L);

        for (UserActionDto userAction : userActionDtoList) {
            System.out.println(userAction);
        }
    }
}
