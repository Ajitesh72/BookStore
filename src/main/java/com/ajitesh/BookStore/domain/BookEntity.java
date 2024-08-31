package com.ajitesh.BookStore.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="books")
public class BookEntity {
    @Id private String isbn;

    private String author;

    private String title;
}

//i am using hibernate db