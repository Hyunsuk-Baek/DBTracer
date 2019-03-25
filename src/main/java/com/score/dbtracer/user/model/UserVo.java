/*
* File Name : Customer.java
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
package com.score.dbtracer.user.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.score.dbtracer.common.CommonVo;

import lombok.Getter;
import lombok.Setter;


/**
 * Method description
 *
 * @author mixkorea
 * @since  2019. 3. 11.
 * @version 
 * @see
 */
@Entity
@Table(name = "t_user")
@Getter
@Setter
public class UserVo extends CommonVo implements Serializable {
    /* serialVersionUID */
    private static final long serialVersionUID = 4721151120820367569L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long                      id;

    @Column(name = "passwd")
    String                    passwd;

    @Column(name = "name")
    String                    name;

    @Column(name = "email")
    String                    email;

    @Column(name = "use_yn")
    boolean                   useYn;


    protected UserVo() {

    }


    public UserVo(String name, String passwd, String email, boolean useYn) {
        this.name = name;
        this.passwd = passwd;
        this.email = email;
        this.useYn = useYn;
    }
}
