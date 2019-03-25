/*
* File Name : UserController.java
* Author : mixkorea
* Date : 2019-03-11
* Description : File description
* 
* Modification Information
* Date         Reviser      Description
* ------------ ----------- ---------------------------
* 2019. 3. 11. mixkorea     최초작성
* 2019. 3. 11. mixkorea     수정사항 입력
*
* 상기 프로그램에 대한 저작권을 포함한 지적재산권은 에스코어(주)에 있으며,
* 에스코어(주)가 명시적으로 허용하지 않은 사용, 복사, 변경, 제3자에의 공개,
* 배포는 엄격히 금지되며, 에스코어(주)의 지적 재산권 침해에 해당됩니다.
* (Copyright ⓒ 2014 S-Core Co., Ltd. All Rights Reserved| Confidential)
*/
package com.score.dbtracer.user.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.score.dbtracer.common.Constants;
import com.score.dbtracer.user.model.UserVo;
import com.score.dbtracer.user.service.UserService;


/**
 * Method description
 *
 * @author mixkorea
 * @since  2019. 3. 11.
 * @version 
 * @see
 */

@RestController("users")
@RequestMapping(Constants.API_URI_PREFIX + "/users")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping
    @ResponseBody
    public UserVo createUser(@RequestBody final UserVo userVo) {
        return userService.createUser(userVo);
    }


    @GetMapping("/{userName:.+}")
    @ResponseBody
    public List<UserVo> readUser(@PathVariable final String userName) throws Exception {
        List<UserVo> userList = userService.findByName(userName);
        if (userList == null || userList.isEmpty()) {
            throw new Exception("err");
        }
        return userService.findByName(userName);
    }
}
