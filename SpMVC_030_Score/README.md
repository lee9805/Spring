# 성적처리 프로젝트
* SpMVC)030_Score
* bean-package : com.callor.score

## DB 연동
* MySQL 의 schoolDB
## table
* tbl_student, tbl_score, tbl_subjcet

## DB 연동을 위한 Dependency 설정
* spring-jdbc
* commons-dbcp2
* mybatis
* mybatis-spring
* mysql-connector/j
* spring-framework : 5.2.22.rel
* lombok
* logback-classic

# package 설정
* model package, persistance package

## mapper folder 생성
* /WEB-INF/spring/mapper

## VO 클래스
*  tbl_student, tbl_score, tbl_subject를 참조하여 각각 studentVO, ScoreVO, SubjectVO를 model package에 생성

## Dao 인터페이스
* persistance.GenericDao interface
selectAll(), findById(), insert(), update(), delete() method 선언

## Student 정보 요청
* http://localhost:8080/score/student로 요청을 하면 학생데이터 전체를 JSON 웹 화면에 보여주는 코드 작성
* StudentController 에 @ResponseBody 부착된 home() method 선언
* StudentService.selectAll()
* StudentDao.selectAll()
* Student-mapper.xml.selectAll