# 📚 도서 관리 애플리케이션 개발 (Library-Application)
* 도서 관리에 필요한 기능을 간단하게 개발 후 배포하는 것을 목적으로 하는 토이프로젝트 입니다. 
* 학습한 Java - Spring Boot - JPA - AWS 기술을 활용하여 프로젝트 한 사이클을 돌리는 것을 목표로 하고 있습니다. 
* 간단한 API 개발을 연습하면서 다음 프로젝트에 추가로 적용할 사항을 고민했습니다.

<br>

* 👉 [도서관리 애플리케이션 바로가기](http://www.library-application.shop:8080/v1/index.html) <br>
  ‼️ 현재는 EC2 인스턴스 중지 상태로, 접속되지 않습니다. ‼️

<br>
<br>

## 1. 제작 기간
#### `2024년 1월 4일 ~ 2024년 2월 2일`

<br>
<br>

## 2. 사용 기술 
* Java 17
* Spring Boot 3.2.1 
* JPA, Spring Data JPA
* Gradle
* MySQL 8.1.0
* H2 Database
* AWS EC2

<br>
<br>

## 3. 주요 기능
* #### 💁🏻‍♀️ `사용자`
    * 도서관의 사용자를 등록 할 수 있습니다. 
    * 도서관 사용자를 조회할 수 있습니다. 
    * 도서관 사용자의 이름을 업데이트 할 수 있습니다. 
    * 도서관 사용자를 삭제할 수 있습니다. 

* #### 📔 `책` 
    * 도서관에 책을 등록할 수 있습니다. 
    * 사용자가 도서관에 등록된 책을 대출할 수 있습니다. 
        * 다른 사람이 먼저 책을 대출했다면, 반납 전까지 해당 책을 대출할 수 없습니다. 
    * 사용자가 도서관에 책을 반납할 수 있습니다. 

<br>
<br>

## 4. ERD 

<img width="800" alt="Library-Application ERD" src="https://github.com/chujaeyeong/Library-Application/assets/123634960/8d4f79f1-f80c-4ccc-8281-d7e32ea947bd">

* 연관관계를 가지는 엔티티는 user, user_loan_history 입니다. (사용자 - 대출이력)

<br>
<br>

## 5. API 명세서

#### 💁🏻‍♀️ `사용자` (UserController)

| 기능          | URL     | Method | Request Body                                              | Description                |
|---------------|---------|--------|-----------------------------------------------------------|----------------------------|
| 유저 저장     | `/user` | POST   | ```json { "name": "String (null 불가능)", "age": "Integer (null 불가능)" } ``` | 새로운 유저를 저장합니다.  |
| 유저 전체 조회 | `/user` | GET    | -                                                         | 모든 유저 정보를 조회합니다. |
| 유저 이름 수정 | `/user` | PUT    | ```json { "id": "Long (null 불가능)", "name": "String (null 불가능)" } ```     | 기존 유저의 이름을 수정합니다. |
| 유저 삭제     | `/user` | DELETE | `name` (String)                                           | 유저를 삭제합니다.         |


#### 📔 `책`  (BookController)

| 기능          | URL          | Method | Request Body                                                                  | Description         |
|---------------|--------------|--------|------------------------------------------------------------------------------|---------------------|
| 책 저장       | `/book`      | POST   | ```json { "name": "String (null 불가능)" } ```                                   | 새로운 책을 저장합니다.  |
| 책 대출 처리  | `/book/loan` | POST   | ```json { "userId": "Long (null 불가능)", "bookId": "Long (null 불가능)" } ```      | 책을 대출 처리합니다.   |
| 책 반납 처리  | `/book/return`| PUT   | ```json { "userId": "Long (null 불가능)", "bookId": "Long (null 불가능)" } ```      | 책을 반납 처리합니다.   |

<br>
<br>

## 6. 기능 구현

<img width="800" alt="Library-Application 편집완료_배속완료_용량압축" src="https://github.com/chujaeyeong/Library-Application/assets/123634960/10ab3f83-9d7b-451d-bd74-4ee509ebe067">

* 프론트 자료 출처 : [최태현 - 자바와 스프링 부트로 생애 최초 서버 만들기, 누구나 쉽게 개발부터 배포까지](https://www.inflearn.com/course/%EC%9E%90%EB%B0%94-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EC%84%9C%EB%B2%84%EA%B0%9C%EB%B0%9C-%EC%98%AC%EC%9D%B8%EC%9B%90/dashboard)


<br>
<br>

## 7. 개발 후기 
* 국비지원 교육 이후에 새로 배웠던 JPA를 기반으로 Spring Data JPA 를 직접 적용하는 연습을 할 수 있었습니다.
* 국비지원 교육 과정에서는 깊이 고민을 못 했던 스프링 MVC 구조, 기능에 대해 고민하면서 개발할 수 있었습니다. 
* JPA 강의를 들으면서 진행해서 시간이 조금 걸렸지만, 빠르게 개발부터 배포까지 한 사이클을 돌릴 수 있어서 전반적인 API 개발 과정을 복습할 수 있었습니다. 
* 이번에는 간단한 API를 개발하느라 테스트코드를 작성하지 않고 개발을 진행했지만, 다음 프로젝트부터는 기능별로 테스트코드 작성하는 것을 적극 활용하여 개발 해야겠다는 점을 인지했습니다.
* JPA 학습 후 Spring Data JPA 는 이번 프로젝트를 진행하는 도중에 자료를 찾아가면서 추가해봤는데, 제대로 배우지 않고 추가한 느낌이 들었습니다. 그래서 다음 프로젝트를 진행하면서는 Spring Data JPA 를 학습 하고, 이해하는 과정이 필요하다고 느꼈습니다. 

<br>
