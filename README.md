# 📚 도서 관리 애플리캐이션 개발 (Library-Application)
* 도서관에서 사용하는 도서 관리에 필요한 기능을 간단하게 개발 후 배포하는 것을 목적으로 하는 토이프로젝트 입니다. 
* 학습한 Java - Spring Boot - JPA - AWS 기술을 활용하여 프로젝트 한 사이클을 돌리는 것을 목표로 하고 있습니다. 

<br>
<br>

## 1. 제작 기간
#### `2024년 1월 4일 ~ ing`

<br>
<br>

## 2. 사용 기술 
* Java 17
* Spring Boot 3.2.1 
* JPA, Spring Data JPA
* Gradle
* JUnit5
* MySQL 8.1.0
* H2 Database
* AWS EC2, RDS, S3

<br>
<br>

## 3. 요구사항 
* #### 💁🏻‍♀️ `사용자`
    * 도서관의 사용자를 등록 할 수 있다. 
    * 도서관 사용자를 조회할 수 있다. 
    * 도서관 사용자의 이름을 업데이트 할 수 있다. 
    * 도서관 사용자를 삭제할 수 있다. 

* #### 📔 `책` 
    * 도서관에 책을 등록할 수 있다. 
    * 사용자가 도서관에 등록된 책을 대여할 수 있다. 
        * 다른 사람이 먼저 대여했다면, 반납 전까지 해당 책을 대여할 수 없다. 
    * 사용자가 도서관에 책을 반납할 수 있다. 

