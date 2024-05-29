package com.mycompany.loan_control.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;


@Entity
@Table(name = "loans")
public class Loan implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private LocalDate loanDate;
  private int days;
  private LocalDate returnDate;
  @Column(name = "user_id")
  private Long userId;
  private boolean returned;
  @Column(name = "created_at")
  private LocalDate createdAt;
  @Column(name = "updated_at")
  private LocalDate updatedAt;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", insertable = false, updatable = false)
  private User user;

  @OneToMany(mappedBy = "loan")
  private List<LoanDetail> loanDetails;

  @PrePersist
  public void prePersist() {
      this.setCreatedAt(LocalDate.now());
      this.setLoanDate(LocalDate.now());
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
     * @return the loanDate
     */
    public LocalDate getLoanDate() {
        return loanDate;
    }

    /**
     * @param loanDate the loanDate to set
     */
    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    /**
     * @return the days
     */
    public int getDays() {
        return days;
    }

    /**
     * @param days the days to set
     */
    public void setDays(int days) {
        this.days = days;
    }

    /**
     * @return the returnDate
     */
    public LocalDate getReturnDate() {
        return returnDate;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * @return the userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return the returned
     */
    public boolean isReturned() {
        return returned;
    }

    /**
     * @param returned the returned to set
     */
    public void setReturned(boolean returned) {
        this.returned = returned;
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
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the loanDetails
     */
    public List<LoanDetail> getLoanDetails() {
        return loanDetails;
    }

    /**
     * @param loanDetails the loanDetails to set
     */
    public void setLoanDetails(List<LoanDetail> loanDetails) {
        this.loanDetails = loanDetails;
    }
}
