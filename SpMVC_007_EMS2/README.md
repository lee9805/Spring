# EMS 프로젝트

## DBMS 연동 도구
* mysql-connector-;
* mybatis
* mybatis-spring
* spring-jdbc

## 파일 업로드 도구
* commons-dbcp
* commons-io
* commons-fileupload

## JSON 관련 도구
* jackson-bind

## 메일 전송 도구
* JavaMail API (compat) 1.4.7 (mail로 검색)

## 암호화 도구
* Spring security core (RELEASE)
* jasypt
```
<!-- https://mvnrepository.com/artifact/org.jasypt/jasypt -->
<dependency>
    <groupId>org.jasypt</groupId>
    <artifactId>jasypt</artifactId>
    <version>${org.jasypt-version}</version>
</dependency>
```
* jasypt-spring31(JASYPT: Java Simplified Encryption)
* 버전 통일 시키기 <org.jasypt-version>1.9.3</org.jasypt-version> 
${org.jasypt-version}

## 데이터 유효성 검사 도구
* 서버(controller) 단에서 데이터 유효성 검사 도구
* validation api
```
<!-- https://mvnrepository.com/artifact/javax.validation/validation-api -->
<dependency>
    <groupId>javax.validation</groupId>
    <artifactId>validation-api</artifactId>
    <version>2.0.1.Final</version>
</dependency>
```
* hibernate validation (Hibernate Validator Engine)
```
<!-- https://mvnrepository.com/artifact/org.hibernate.validator/hibernate-validator -->
<dependency>
    <groupId>org.hibernate.validator</groupId>
    <artifactId>hibernate-validator</artifactId>
    <version>${org.springframework-version}</version>
</dependency>
```
* spring framework 5.x 버전에서는 서버단 유효성검사를 위하여 framework 관련 요소를 추가해 주어야 한다


## MIME type 
* 인터넷을 통해서 다양한 형태의 데이터를 보낼때 서버와 웹 브라우저, 클라이언트 간에 데이터의 형식을 지정하는 방식
* 일반적으로 html 데이터는 text/html 형식으로 기본값으로 설정되어 있다
* 만약 html 데이터를 text/plan형식으로 보내면 웹브라우저에 html tag가 단순한 문자열로 그대로 노출된다
* MIME type 은 인터넷 환경이 발전할 수록 계속 많아지고 더욱 다양해 진다
* 현재 주로 많이 사용하는것은 text/html, image/jpg, video/mp4, audio/mp3, application/json 등이 있다