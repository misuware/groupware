package groupware.com.service.vo;

import lombok.Data;

@Data
public class CommonVO {
    // 공통적으로 필요한 field 선언
    private int pageIndex = 1; /*현재 페이지*/
    private int firstIndex; /*sql offset*/
    private int totalRecordCnt; /*총 레코드 수*/
    private int recordCntPerPage = 10; /*한 페이지에 표시될 레코드 수*/
    private int pageSize = 10; /*한 페이지 블럭에 표시될 페이지 수*/

    private String userId; /*현재 로그인한 회원 아이디*/
    private String userNm; /*현재 로그인한 회원 이름*/
    private String authCd; /*현재 로그인한 회원의 권한 코드 (U/A)*/
    private String authNm; /*현재 로그인한 회원의 권한명 (사용자/관리자)*/
}
