package com.mycompany.loan_control.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "books")
public class Book implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long isbn;
  @ColumnDefault("' '")
  @Column(length = 50)
  private String name;
  @ColumnDefault("' '")
  @Column(length = 500)
  private String description;
  @ColumnDefault("' '")
  private String image;
  @Column(name = "created_at")
  private LocalDate createdAt;
  @Column(name = "updated_at")
  private LocalDate updatedAt;

  @OneToMany(mappedBy = "book")
  private List<LoanDetail> loanDetails;

  @PrePersist
  public void prePersist() {
      this.setCreatedAt(LocalDate.now());
  }

    /**
     * @return the isbn
     */
    public Long getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
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
