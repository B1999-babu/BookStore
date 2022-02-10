package com.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.domain.UserShipping;

public interface UserShippingRepository extends JpaRepository<UserShipping, Long> {
	
	

}
