/*
* File Name : ParseService.java
* Author : mixkorea
* Date : 2019-03-20
* Description : File description
* 
* Modification Information
* Date         Reviser      Description
* ------------ ----------- ---------------------------
* 2019. 3. 20. mixkorea     최초작성
* 2019. 3. 20. mixkorea     수정사항 입력
*
* 상기 프로그램에 대한 저작권을 포함한 지적재산권은 에스코어(주)에 있으며,
* 에스코어(주)가 명시적으로 허용하지 않은 사용, 복사, 변경, 제3자에의 공개,
* 배포는 엄격히 금지되며, 에스코어(주)의 지적 재산권 침해에 해당됩니다.
* (Copyright ⓒ 2014 S-Core Co., Ltd. All Rights Reserved| Confidential)
*/
package com.score.dbtracer.parser.service;


import net.sf.jsqlparser.JSQLParserException;


/**
 * Method description
 *
 * @author mixkorea
 * @since  2019. 3. 20.
 * @version 
 * @see
 */

public interface ParseService {
    public String parse(String sql) throws JSQLParserException;
}