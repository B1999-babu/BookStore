package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.domain.UserPayment;

public interface UserPaymentRepository extends JpaRepository<UserPayment, Long>{

}
