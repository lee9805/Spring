# form 과 button 관계

```
<form>
	<button typt="submit">
</form>
```
* 위와 같이 form tag에 포함된 button 기본적으로type 이 ```submit``` 이다
* button type 이 ```submit``` 인경우 form tag 에 포함된 inputbox의 값을 무조건 서버로 전송하는 event가 실행된다
* 만약 button을 클릭했을때 Js코드를 사용하여 상황을 제어 하고 싶으면 button type 을 ```button```으로 설정한다
* button type 을 ```button``` 으로 설정하면 모양만 button이고 아무런 역할을 수행하지 못한다
* button type에는 ```reset```도 있는데 이 type을 form tag에 포함된 input box 데이터를 모두 제거한다

## password 암호화 하기
* Spring-seccurity-core 가져오기
```
<dependency>
	<groupId>org.springframework.security</groupId>
	<artifactId>spring-security-core</artifactId>
	<version>5.3.13.RELEASE</version>
</dependency>
```
* Spring/appServlet/security-context.xml 파일

```
<bean id="passwordEncoder" class="org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder">
	<constructor-arg index="0" value="4"/>
</bean>
```
* PasswordEncoder 를 상속받은 BCryptPasswordEncoder 클래스를 사용하여 bean 선언
* 이때 생성자에 설정한 value 값에 따라 내부에서 암호화 반복이 수행된다
* 이 값은 4이상의 정수로 설정한다
* 기본값은 4이며, 값이 커지면 암호화에서 시간이 많이 소요된다




























