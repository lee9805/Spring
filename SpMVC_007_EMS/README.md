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
