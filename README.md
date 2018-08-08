# spring boot에서 JSP 사용 설정하기

### 프로젝트 생성 후 web.xml 생성
1.Project Structure(Ctrl + Alt + Shift + s)  
2.Facets  
3.web 추가  
4.Deployment Descriptors의 경로 수정

내가 설정한 경로
>src/main/webapp/WEB-INF/view


### dependency 추가
```xml
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
</dependency>

<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
    <scope>provided</scope>
</dependency>
```


### jsp prefix, suffix 설정
application.yml에 설정 추가
```
spring:  
   mvc:  
     view:  
       prefix: /WEB-INF/view/  
       suffix: .jsp
```
