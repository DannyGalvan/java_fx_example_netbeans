package com.mycompany.loan_control.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "loan_details")
public class LoanDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "loan_id")
    private Long loanId;
    @Column(name = "book_id")
    private Long bookId;
    private int quantity;
    @Column(name = "created_at")
    private LocalDate createdAt;
    @Column(name = "updated_at")
    private LocalDate updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loan_id", insertable = false, updatable = false)
    private Loan loan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", insertable = false, updatable = false)
    private Book book;

    @PrePersist
    public void prePersist() {
        this.setCreatedAt(LocalDate.now());
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the loanId
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * @param loanId the loanId to set
     */
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    /**
     * @return the bookId
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the createdAt
     */
    public LocalDate getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the updatedAt
     */
    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return the loan
     */
    public Loan getLoan() {
        return loan;
    }

    /**
     * @param loan the loan to set
     */
    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    /**
     * @return the book
     */
    public Book getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(Book book) {
        this.book = book;
    }
}
