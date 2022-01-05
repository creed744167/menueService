package com.foodappAccountService.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodappAccountService.java.dto.AccountRequestDto;
import com.foodappAccountService.java.dto.AccountResponseProjection;
import com.foodappAccountService.java.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@GetMapping("/account/balance")
	public ResponseEntity<List<AccountResponseProjection>> getDetails(@RequestBody AccountRequestDto  accountRequestDto){
		return new ResponseEntity<List<AccountResponseProjection>> (accountService.getDetails(accountRequestDto), HttpStatus.ACCEPTED);
	}
	
	/*public void getDetails(@RequestBody AccountRequestDto  accountRequestDto){
		accountService.getDetails(accountRequestDto);
	}*/
	
}
