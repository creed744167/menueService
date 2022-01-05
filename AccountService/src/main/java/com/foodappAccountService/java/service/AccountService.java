package com.foodappAccountService.java.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.foodappAccountService.java.dto.AccountRequestDto;
import com.foodappAccountService.java.dto.AccountResponseProjection;

@Service
public interface AccountService {

	List<AccountResponseProjection> getDetails(AccountRequestDto accountRequestDto);

	

}
