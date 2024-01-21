package com.group.libraryapp.domain.user.loanhistory;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserLoanHistory {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    private long userId;

    private String bookName;

    private boolean isReturn;

    // 기본생성자
    protected UserLoanHistory() {

    }

    public UserLoanHistory(long userId, String bookName) {
        this.userId = userId;
        this.bookName = bookName;
        this.isReturn = false;
    }

    public void doReturn() {
        this.isReturn = true;
    }
}
